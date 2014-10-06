package jp.co.monkey.button;

import jp.co.monkey.activity.MainActivity;
import jp.co.monkey.jsbapp.R;
import jp.co.monkey.window.WindowLayoutYellow;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class YellowButton extends LinearLayout {

    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;
    private Button yellowButton;

    public YellowButton(Context context) {
        super(context);
        setLayout();
        setListener();
    }

    public void setLayout() {
        yellowButton = new Button(getContext());
        yellowButton.setBackgroundResource(R.drawable.yellowbtn);
        yellowButton.setOnClickListener((OnClickListener) getContext());
        LayoutParams paramsex = new LayoutParams(WC, WC);
        paramsex.gravity = Gravity.CENTER_HORIZONTAL;
        this.addView(yellowButton, paramsex);
    }

    private void setListener() {
        yellowButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                WindowLayoutYellow windowsyellow = new WindowLayoutYellow(getContext());
                MainActivity.popupWindow.setContentView(windowsyellow);
                if (MainActivity.popupWindow.isShowing()) {
                    MainActivity.popupWindow.dismiss();
                } else {
                    int xoff = BlueButton.blueButton.getWidth();
                    int yoff = BlueButton.blueButton.getHeight();
                    WindowLayoutYellow.mainYellowLinerLayout.setBackgroundColor(Color.argb(70, 255, 255, 0));
                    MainActivity.popupWindow.showAsDropDown(BlueButton.blueButton, xoff / 10,
                            -yoff / 50);
                }
            }
        });
    }
}
