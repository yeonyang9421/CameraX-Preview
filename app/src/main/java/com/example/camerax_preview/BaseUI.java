package com.example.camerax_preview;


import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;


public abstract class BaseUI extends FrameLayout {
    protected IBase    mBase;
    protected Context mContext;
    protected View mParent;
    protected ActionListener mActionListener;
    protected boolean mVisible;

    protected int mUIType;

    public BaseUI(IBase base, int layoutId, int uiType) {
        super(base.getContext());

        mBase    = base;
        mUIType  = uiType;
        mContext = base.getContext();
        //인플레이트
        LayoutInflater inflater = LayoutInflater.from(mContext);
        mParent = inflater.inflate(layoutId, this);
    }

    public BaseUI(IBase base, int layoutId) {
        this(base, layoutId, -1);
    }

    public int getUIType() {
        return mUIType;
    }

    public void runNew(Runnable action) {
        Thread th = new Thread(action);
        th.start();
    }

    public void setActionListener(ActionListener listener) {
        mActionListener = listener;
    }

    public interface ActionListener {
        void onBack(int viewType);
        void onCallAccept(int viewType);
        void onCallDeny(int viewType);
        void onCallEnd(int viewType);
    }

    public boolean isVisible() {
        return mVisible;
    }

    public void onReplace(boolean visible) {
        mVisible = visible;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        return;
    }

    public void onProximityChanged(boolean onOff) { return; }

    //override
    public void onStart() {}
    public void onStop() {}
    public void onCreate() {}
    public boolean onKeyDownEvent(int keyCode, KeyEvent event, String f) { return false; }
    public boolean onKeyUpEvent(int keyCode, KeyEvent event, String f) { return false; }
    public boolean onVolumeJump(int volume) { return false; }

    //abstract
    public abstract void onResume();
    public abstract void onPause();
    public abstract void onBackPressed();
    public abstract void onUpdate(Intent intent);
    public abstract void onDestroy();
    public abstract void onProcess(Intent intent);
}
