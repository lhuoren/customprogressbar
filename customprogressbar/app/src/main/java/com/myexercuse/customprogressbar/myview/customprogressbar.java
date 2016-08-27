package com.myexercuse.customprogressbar.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import com.myexercuse.customprogressbar.R;

/**
 * Created by job on 2016/7/26.
 */
public class customprogressbar extends View{

    private Bitmap mBgBitmap,mFgBitmap,mOut,mOut2;
    private Paint mPaint,mPaint2;
    private Canvas mCanvas,mCanvas2;
    private Path mPath;

    private Bitmap mBitmap;
    private int a = 0;
//    private Bitmap mOut;
//    private Paint mPaint;


    private float fAngle = 0.0f;    //  图片旋转
    private Matrix matrix = null;
    private int nBitmapWidth = 0;   //  图片的宽度
    private int nBitmapHeight = 0;  //  图片的高度
    private int nPosX = 120;    //  图片所在的位置X
    private int nPosY = 10; //  图片所在的位置Y
    private Bitmap bitmapDisplay = null;
    private Paint paint = null; //  画笔

    public customprogressbar(Context context) {
        super(context);
        initView();
//        setRotationRight();
    }

    public customprogressbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
//        setRotationRight();
    }

    public customprogressbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
//        setRotationRight();
    }

    public customprogressbar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView();
//        setRotationRight();
    }

    private void initView() {
        mBgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.loading00);
        mFgBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.loading01);

        mOut = Bitmap.createBitmap(mBgBitmap.getWidth(),mBgBitmap.getHeight(),Bitmap.Config.ARGB_8888);
        mOut2 = Bitmap.createBitmap(mBgBitmap.getWidth(),mBgBitmap.getHeight(),Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mOut);
        mCanvas2 = new Canvas(mOut2);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);


    }

//    public void initView() {
//        paint = new Paint();
//        paint.setFlags(Paint.ANTI_ALIAS_FLAG);
//
//        mBitmap = BitmapFactory.decodeResource(getResources(),
//                R.drawable.loading01);
//        bitmapDisplay = mBitmap;
//        matrix = new Matrix();
//        //  获取图片高度和宽度
//        nBitmapWidth = mBitmap.getWidth();
//        nBitmapHeight = mBitmap.getHeight();
//
//        mOut = Bitmap.createBitmap(mBitmap.getWidth(),
//                mBitmap.getHeight(), Bitmap.Config.ARGB_8888);
//        Canvas canvas = new Canvas(mOut);
//        mPaint = new Paint();
//        mPaint.setAntiAlias(true);
//        canvas.drawRoundRect(0, 0,
//                mBitmap.getWidth(),
//                mBitmap.getHeight(), 80, 80, mPaint);
//        mPaint.setXfermode(new PorterDuffXfermode(
//                PorterDuff.Mode.SRC_IN));
//        canvas.drawBitmap(mBitmap, 0, 0, mPaint);
//
//    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int screenWidth = canvas.getWidth();
        int screenHeight = canvas.getHeight();
        a += 8;
        canvas.save();
        Bitmap prograss_bg = BitmapFactory.decodeResource(getResources(), R.drawable.loading01);
//        int x = prograss_bg.getWidth();
//        int y = prograss_bg.getHeight();

        int x = prograss_bg.getWidth();
        int y = prograss_bg.getHeight();
        canvas.translate(screenWidth/2 - x/2, screenHeight/2 - y/2);
        canvas.rotate(a, x/2, y/2);
        canvas.drawBitmap( prograss_bg , 0, 0, new Paint());
        canvas.restore();

        canvas.save();
        Bitmap prograss = BitmapFactory.decodeResource(getResources(), R.drawable.loading00);
//        mCanvas.drawRoundRect(0,0, mBgBitmap.getWidth(),mBgBitmap.getHeight(),80,80,mPaint);
        canvas.translate(screenWidth/2 - x/2, screenHeight/2 - y/2);
        canvas.drawBitmap( prograss , 0, 0, new Paint());
        canvas.restore();
//        canvas.drawBitmap(bitmapDisplay, nPosX, nPosY, paint);
//        invalidate();


//        mCanvas.drawRoundRect(0,0, mBgBitmap.getWidth(),mBgBitmap.getHeight(),80,80,mPaint);
//        mCanvas2.drawRoundRect(0,0, mFgBitmap.getWidth(),mFgBitmap.getHeight(),100,100,mPaint);
//        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
//        mCanvas.drawBitmap(mBgBitmap,0,0,mPaint);
//        mCanvas2.drawBitmap(mFgBitmap,0,0,mPaint);
//        canvas.drawBitmap(mOut, 260, 360, null);
//        canvas.drawBitmap(mOut2, 260, 360, null);
////        canvas.translate(130,280);
//        canvas.rotate(a);
//        canvas.drawBitmap(mOut, 260, 360, null);
//        canvas.drawBitmap(mOut2, 260, 360, null);
//        canvas.drawBitmap(mOut2, 260, 360, null);
//        canvas.drawBitmap(mOut, 1, 1, null);
        invalidate();

    }


    //  向右旋转
//    public void setRotationRight() {
//        fAngle++;
//        setAngle();
//    }
//
//    //  设置旋转比例
//    private void setAngle() {
//        matrix.reset();
//        matrix.setRotate(fAngle);
//        bitmapDisplay = Bitmap.createBitmap(mBitmap,0,0,nBitmapWidth,nBitmapHeight,matrix,true);
//    }
}
