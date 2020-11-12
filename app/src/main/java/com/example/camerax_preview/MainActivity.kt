package com.example.camerax_preview

import android.Manifest
import android.os.Bundle
import android.util.Log
import android.util.Size
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.*
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.akexorcist.example.camerax.helper.ShortenMultiplePermissionListener
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : BaseActivity() {
    private var lensFacing = CameraSelector.LENS_FACING_BACK
    private var camera: Camera? = null
    private var imageCapture: ImageCapture? = null
    private var cameraProvider: ProcessCameraProvider? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        buttonCaptureImage.setOnClickListener { onCaptureImage() }
//        requestRuntimePermission()
        setupCameraProvider()
    }

    private fun requestRuntimePermission() {
        Dexter.withActivity(this)
            .withPermissions(Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO)
            .withListener(multiplePermissionsListener)
            .check()

    }

    private fun setupCameraProvider() {
        ProcessCameraProvider.getInstance(this).also { provider ->
            provider.addListener(Runnable {
//                indPreview(provider.get())
                cameraProvider = provider.get()
                bindCamera()
            }, ContextCompat.getMainExecutor(this))
        }

        if(lensFacing==CameraSelector.LENS_FACING_BACK){
            lensFacing=CameraSelector.LENS_FACING_FRONT
            cameraProvider?.unbindAll()
            bindCamera()
        }
    }

    private fun bindCamera() {
        val preview: Preview = Preview.Builder()
            .build()
        val cameraSelector = createCameraSelector()
        imageCapture = createCameraCapture()
        camera = cameraProvider?.bindToLifecycle(this, cameraSelector, preview, imageCapture)
        camera?.let { camera ->
            preview.setSurfaceProvider(previewView.createSurfaceProvider(camera.cameraInfo))
        }
    }

    private fun createCameraCapture(): ImageCapture = ImageCapture.Builder()
        .setTargetResolution(Size(1200, 1200))
        .build()

    private fun createCameraSelector(): CameraSelector = CameraSelector.Builder()
        .requireLensFacing(lensFacing)
        .build()

    private fun bindPreview(cameraProvider: ProcessCameraProvider) {
        Log.d("MainActivity", "bindPreview: ")
        val preview: Preview = Preview.Builder()
            .build()

        imageCapture = ImageCapture.Builder()
            .build()

        val cameraSelector: CameraSelector = CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_FRONT)
            .build()

        camera = cameraProvider.bindToLifecycle(this, cameraSelector, preview, imageCapture)
        camera?.let { camera ->
            preview.setSurfaceProvider(previewView.createSurfaceProvider(camera.cameraInfo))
        }
    }

    private fun cameraSelector(): CameraSelector {
        val cameraSelector: CameraSelector = CameraSelector.Builder()
            .requireLensFacing(lensFacing)
            .build()
        return cameraSelector
    }

//    private fun onCaptureImage() {
//        val file = File(filesDir.absoluteFile, "temp.jpg")
//        val outputFileOptions: ImageCapture.OutputFileOptions = ImageCapture.OutputFileOptions.Builder(file).build()
//        imageCapture?.takePicture(outputFileOptions, ContextCompat.getMainExecutor(this), imageSavedCallback)
//    }

//    private val imageSavedCallback = object : ImageCapture.OnImageSavedCallback {
//        override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
//            showResultMessage(getString(R.string.image_capture_success))
//        }
//
//        override fun onError(exception: ImageCaptureException) {
//            showResultMessage(getString(R.string.image_capture_error, exception.message, exception.imageCaptureError))
//        }
//    }

    private val multiplePermissionsListener = object : ShortenMultiplePermissionListener() {
        override fun onPermissionsChecked(report: MultiplePermissionsReport) {
            if (report.areAllPermissionsGranted()) {
                onPermissionGrant()
            } else {
                onPermissionDenied()
            }
        }
    }

    private fun onPermissionGrant() {
        setupCameraProvider()
    }

    private fun onPermissionDenied() {
        showResultMessage(getString(R.string.permission_denied))
        finish()
    }

    private fun showResultMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}