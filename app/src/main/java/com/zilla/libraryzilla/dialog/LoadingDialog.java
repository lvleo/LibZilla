package com.zilla.libraryzilla.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.github.snowdream.android.util.Log;
import com.zilla.android.zillacore.libzilla.lifecircle.ILifeCircle;
import com.zilla.libraryzilla.R;

/**
 * Created with IntelliJ IDEA.
 * User: chenze
 * Date: 13-10-11
 * Time: 上午10:23
 * To change this template use File | Settings | File Templates.
 */
public class LoadingDialog implements ILifeCircle,IDialog {

    private Context context;

    public LoadingDialog(Context context) {
        this.context = context;
    }

    private LoadingDialogEntity dialogEntity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        dialogEntity = new LoadingDialogEntity(context, R.style.CustomProgressDialog);
//        dialogEntity = new LoadingDialogEntity(context);
        dialogEntity.setCanceledOnTouchOutside(false);
    }

    @Override
    public void onResume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onPause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onDestroy() {
        dismiss();
    }

    /**
     * 显示dialog
     */
    @Override
    public void show() {
        try {
            if (dialogEntity != null) {
                dialogEntity.show();
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
    }

    @Override
    public void show(String title) {
        try {
            if (dialogEntity != null) {
                dialogEntity.setTitle(title);
                dialogEntity.show();
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
    }

    /**
     * 隐藏dialog
     */
    @Override
    public void dismiss() {
        try {
            if (dialogEntity != null) {
                dialogEntity.dismiss();
            }
        } catch (Exception e) {
            Log.e(e.getMessage());
        }
    }

}