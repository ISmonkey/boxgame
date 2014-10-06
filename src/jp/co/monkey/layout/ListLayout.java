package jp.co.monkey.layout;

import jp.co.monkey.jsbapp.R;
import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListLayout extends LinearLayout {

    // private final int MP = LinearLayout.LayoutParams.MATCH_PARENT;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;

    LinearLayout item1LinerLayout;
    LinearLayout item2LinerLayout;
    LinearLayout item3LinerLayout;
    LinearLayout item4LinerLayout;
    LinearLayout item5LinerLayout;

    String colorItemArry[][] = new String[3][5];
    public static int redItemNumber;
    public static int blueItemNumber;
    public static int yellowItemNumber;

    public static int cbNumber01;
    public static int cbNumber02;
    public static int cbNumber03;
    public static int cbNumber04;
    public static int cbNumber05;

    private int count = 0;
    public static ImageView cb1;
    public static ImageView cb2;
    public static ImageView cb3;
    public static ImageView cb4;
    public static ImageView cb5;

    public static int redItem01;
    public static int redItem02;
    public static int redItem03;
    public static int redItem04;
    public static int redItem05;

    public static int blueItem01;
    public static int blueItem02;
    public static int blueItem03;
    public static int blueItem04;
    public static int blueItem05;

    public static int yellowItem01;
    public static int yellowItem02;
    public static int yellowItem03;
    public static int yellowItem04;
    public static int yellowItem05;

    public int rnd1 = 2;

    TextView tv01;
    TextView tv02;
    TextView tv03;
    TextView tv04;
    TextView tv05;

    public ListLayout(Context context) {
        super(context);

        colorItemArry[0][0] = "いちご";
        colorItemArry[0][1] = "りんご";
        colorItemArry[0][2] = "さくらんぼ";
        colorItemArry[0][3] = "もも";
        colorItemArry[0][4] = "らずべりー";

        colorItemArry[1][0] = "ぶどう";
        colorItemArry[1][1] = "ぶるーべりー";
        colorItemArry[1][2] = "ぷるーん";
        colorItemArry[1][3] = "ますかっと";
        colorItemArry[1][4] = "めろん";

        colorItemArry[2][0] = "ばなな";
        colorItemArry[2][1] = "れもん";
        colorItemArry[2][2] = "ぱいなっぷる";
        colorItemArry[2][3] = "みかん";
        colorItemArry[2][4] = "かき";

        listLayout();
    }

    public void listLayout() {

        // リストが表示される部分
        LinearLayout listLayout2 = new LinearLayout(getContext());
        listLayout2.setOrientation(LinearLayout.VERTICAL);
        listLayout2.setBackgroundResource(R.drawable.backgroundmain1);
        LayoutParams paramslist2 = new LayoutParams(WC, WC);
        paramslist2.weight = 1.0f;
        this.addView(listLayout2, paramslist2);

        item1LinerLayout = new LinearLayout(getContext());
        listLayout2.addView(item1LinerLayout);

        /* 一つ目のチェックボックスとテキスト */
        cb1 = new ImageView(getContext());
        cb1.setImageResource(R.drawable.check_none);

        tv01 = new TextView(getContext());
        tv01.setTextSize(20f);

        /* 二つ目のチェックボックスとテキスト */
        item2LinerLayout = new LinearLayout(getContext());
        listLayout2.addView(item2LinerLayout);

        cb2 = new ImageView(getContext());
        cb2.setImageResource(R.drawable.check_none);

        tv02 = new TextView(getContext());
        tv02.setTextSize(20f);

        item3LinerLayout = new LinearLayout(getContext());
        listLayout2.addView(item3LinerLayout);

        /* 三つ目のチェックボックスとテキスト */
        cb3 = new ImageView(getContext());
        cb3.setImageResource(R.drawable.check_none);

        tv03 = new TextView(getContext());
        tv03.setTextSize(20f);

        item4LinerLayout = new LinearLayout(getContext());
        listLayout2.addView(item4LinerLayout);

        /* 四つ目のチェックボックスとテキスト */
        cb4 = new ImageView(getContext());
        cb4.setImageResource(R.drawable.check_none);

        tv04 = new TextView(getContext());
        tv04.setTextSize(20f);

        item5LinerLayout = new LinearLayout(getContext());
        listLayout2.addView(item5LinerLayout);

        /* 五つ目のチェックボックスとテキスト */
        cb5 = new ImageView(getContext());
        cb5.setImageResource(R.drawable.check_none);

        tv05 = new TextView(getContext());
        tv05.setTextSize(20f);

        int rndShowText = (int) Math.floor(Math.random() * 2 + 4);
        for (int i = 0; i < rndShowText; i++) {
            rnd1 = (int) Math.floor(Math.random() * 3);

            if (rnd1 == 0) {
                setTextRedRnd();
            } else if (rnd1 == 1) {
                setTextBlueRnd();
            } else if (rnd1 == 2) {
                setTextYellowRnd();
            }
        }
        item1LinerLayout.addView(cb1);
        item2LinerLayout.addView(cb2);
        item3LinerLayout.addView(cb3);
        item4LinerLayout.addView(cb4);
        item1LinerLayout.addView(tv01);
        item2LinerLayout.addView(tv02);
        item3LinerLayout.addView(tv03);
        item4LinerLayout.addView(tv04);
        if (rndShowText == 5) {
            item5LinerLayout.addView(cb5);
            item5LinerLayout.addView(tv05);
        }
    }

    public void setTextRedRnd() {
        redItem01 = (int) Math.floor(Math.random() * 4);
        redItem02 = (int) Math.floor(Math.random() * 4);
        redItem03 = (int) Math.floor(Math.random() * 4);
        redItem04 = (int) Math.floor(Math.random() * 4);
        redItem05 = (int) Math.floor(Math.random() * 4);

        if (count == 0) {
            tv01.setText(colorItemArry[0][redItem01]);
            for (int i = 0; i < 4; i++) {
                if (redItem01 == i) {
                    redItemNumber = i + 1;
                    cbNumber01 = 1;
                }
            }
            tv01.setTextColor(Color.RED);
            count++;
        } else if (count == 1) {
            tv02.setText(colorItemArry[0][redItem02]);
            for (int i = 0; i < 4; i++) {
                if (redItem02 == i) {
                    redItemNumber = i + 1;
                    cbNumber02 = 2;
                }
            }
            tv02.setTextColor(Color.RED);
            count++;
        } else if (count == 2) {
            tv03.setText(colorItemArry[0][redItem03]);
            for (int i = 0; i < 9; i++) {
                if (redItem03 == i) {
                    redItemNumber = i + 1;
                    cbNumber03 = 3;
                }
            }
            tv03.setTextColor(Color.RED);
            count++;
        } else if (count == 3) {
            tv04.setText(colorItemArry[0][redItem04]);
            for (int i = 0; i < 9; i++) {
                if (redItem04 == i) {
                    redItemNumber = i + 1;
                    cbNumber04 = 4;
                }
            }
            tv04.setTextColor(Color.RED);
            count++;
        } else if (count == 4) {
            tv05.setText(colorItemArry[0][redItem05]);
            for (int i = 0; i < 9; i++) {
                if (redItem05 == i) {
                    redItemNumber = i + 1;
                    cbNumber05 = 5;
                }
            }
            tv05.setTextColor(Color.RED);
        }
    }

    public void setTextBlueRnd() {
        blueItem01 = (int) Math.floor(Math.random() * 4);
        blueItem02 = (int) Math.floor(Math.random() * 4);
        blueItem03 = (int) Math.floor(Math.random() * 4);
        blueItem04 = (int) Math.floor(Math.random() * 4);
        blueItem05 = (int) Math.floor(Math.random() * 4);

        if (count == 0) {
            tv01.setText(colorItemArry[1][blueItem01]);
            for (int i = 0; i < 9; i++) {
                if (blueItem01 == i) {
                    blueItemNumber = i + 1;
                    cbNumber01 = 1;
                }
            }
            tv01.setTextColor(Color.BLUE);
            count++;
        } else if (count == 1) {
            tv02.setText(colorItemArry[1][blueItem02]);
            for (int i = 0; i < 9; i++) {
                if (blueItem02 == i) {
                    blueItemNumber = i + 1;
                    cbNumber02 = 2;
                }
            }

            tv02.setTextColor(Color.BLUE);
            count++;
        } else if (count == 2) {
            tv03.setText(colorItemArry[1][blueItem03]);
            for (int i = 0; i < 9; i++) {
                if (blueItem03 == i) {
                    blueItemNumber = i + 1;
                    cbNumber03 = 3;
                }
            }

            tv03.setTextColor(Color.BLUE);
            count++;
        } else if (count == 3) {
            tv04.setText(colorItemArry[1][blueItem04]);
            for (int i = 0; i < 9; i++) {
                if (blueItem04 == i) {
                    blueItemNumber = i + 1;
                    cbNumber04 = 4;
                }
            }

            tv04.setTextColor(Color.BLUE);
            count++;
        } else if (count == 4) {
            tv05.setText(colorItemArry[1][blueItem05]);
            for (int i = 0; i < 9; i++) {
                if (blueItem05 == i) {
                    blueItemNumber = i + 1;
                    cbNumber05 = 5;
                }
            }

            tv05.setTextColor(Color.BLUE);
        }
    }

    private void setTextYellowRnd() {
        yellowItem01 = (int) Math.floor(Math.random() * 4);
        yellowItem02 = (int) Math.floor(Math.random() * 4);
        yellowItem03 = (int) Math.floor(Math.random() * 4);
        yellowItem04 = (int) Math.floor(Math.random() * 4);
        yellowItem05 = (int) Math.floor(Math.random() * 4);

        if (count == 0) {
            tv01.setText(colorItemArry[2][yellowItem01]);
            for (int i = 0; i < 9; i++) {
                if (yellowItem01 == i) {
                    yellowItemNumber = i + 1;
                    cbNumber01 = 1;
                }
            }
            tv01.setTextColor(Color.YELLOW);
            count++;
        } else if (count == 1) {
            tv02.setText(colorItemArry[2][yellowItem02]);
            for (int i = 0; i < 9; i++) {
                if (yellowItem02 == i) {
                    yellowItemNumber = i + 1;
                    cbNumber02 = 2;
                }
            }
            tv02.setTextColor(Color.YELLOW);
            count++;
        } else if (count == 2) {
            tv03.setText(colorItemArry[2][yellowItem03]);
            for (int i = 0; i < 9; i++) {
                if (yellowItem03 == i) {
                    yellowItemNumber = i + 1;
                    cbNumber03 = 3;
                }
            }
            tv03.setTextColor(Color.YELLOW);
            count++;
        } else if (count == 3) {
            tv04.setText(colorItemArry[2][yellowItem04]);
            for (int i = 0; i < 9; i++) {
                if (yellowItem04 == i) {
                    yellowItemNumber = i + 1;
                    cbNumber04 = 4;
                }
            }
            tv04.setTextColor(Color.YELLOW);
            count++;
        } else if (count == 4) {
            tv05.setText(colorItemArry[2][yellowItem05]);
            for (int i = 0; i < 9; i++) {
                if (yellowItem05 == i) {
                    yellowItemNumber = i + 1;
                    cbNumber05 = 5;
                }
            }
            tv05.setTextColor(Color.YELLOW);
        }
    }
}
