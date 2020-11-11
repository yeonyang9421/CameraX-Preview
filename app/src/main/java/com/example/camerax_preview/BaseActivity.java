package com.example.camerax_preview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;

import androidx.appcompat.app.AppCompatActivity;


public class BaseActivity extends AppCompatActivity implements IBase {
    protected int state = PTTDefine.I_NONE;

    @Override
    public boolean isCREATED()   { return state == PTTDefine.UI_STATE.I_CREATED; }
    @Override
    public boolean isSTARTED()   { return state == PTTDefine.UI_STATE.I_STARTED; }
    @Override
    public boolean isRESUMED()   { return state == PTTDefine.UI_STATE.I_RESUMED; }
    @Override
    public boolean isPAUSED ()   { return state == PTTDefine.UI_STATE.I_PAUSED ; }
    @Override
    public boolean isSTOPPED()   { return state == PTTDefine.UI_STATE.I_STOPPED; }
    @Override
    public boolean isDESTROYED() { return state == PTTDefine.UI_STATE.I_DESTROYED; }

    /**
     * 상태 정보를 갱신한다.
     * @param newState
     */
    @Override
    public void updateUIState(int newState) {

        this.state = newState;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        updateUIState(PTTDefine.UI_STATE.I_CREATED);
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateUIState(PTTDefine.UI_STATE.I_STARTED);
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateUIState(PTTDefine.UI_STATE.I_RESUMED);


//        FloatingService.checkAndBallOff(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateUIState(PTTDefine.UI_STATE.I_PAUSED);
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateUIState(PTTDefine.UI_STATE.I_STOPPED);
        //현재 활동 상태 저장

//        FloatingService.checkAndBallOn(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateUIState(PTTDefine.UI_STATE.I_DESTROYED);
        //현재 활동 상태 저장
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
//            DisplayUtil.hideNavigation(this);
        }
    }

    @Override
    public BaseUI getBaseUI(int id) {
        return null;
    }

    @Override
    public synchronized void replaceUI(BaseUI ui) {
    }

    @Override
    public synchronized void replaceUI(int id) {
        BaseUI baseUI = getBaseUI(id);
        if (baseUI != null) {
            replaceUI(baseUI);
        }

        return;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public void showLoading(boolean cancelable, String f) {
    }

    @Override
    public void hideLoading(String f) {

    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_ENDCALL) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

}
