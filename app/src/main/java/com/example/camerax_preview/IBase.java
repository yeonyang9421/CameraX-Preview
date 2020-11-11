package com.example.camerax_preview;

import android.app.Activity;
import android.content.Context;


public interface IBase {
    int state = PTTDefine.I_NONE;

    boolean isCREATED();
    boolean isSTARTED();
    boolean isRESUMED();
    boolean isPAUSED();
    boolean isSTOPPED();
    boolean isDESTROYED();

    void updateUIState(int newState);

    BaseUI getBaseUI(int id);
    void   replaceUI(BaseUI ui);
    void   replaceUI(int id);

    Context getContext();
    Activity getActivity();

    void showLoading(boolean cancelable, String f);
    void hideLoading(String f);
}
