package jp.co.monkey.activity;

import jp.co.monkey.jsbapp.R;
import jp.co.monkey.layout.ListLayout;
import jp.co.monkey.layout.MainLayout;
import jp.co.monkey.window.WindowLayoutBlue;
import jp.co.monkey.window.WindowLayoutRed;
import jp.co.monkey.window.WindowLayoutYellow;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;

public class MainActivity extends Activity implements OnTouchListener,
		OnClickListener {

	public static int number = 0;
	public static int redCount = 0;
	public static int blueCount = 0;

	private int touch = 0;
	public static PopupWindow popupWindow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		MainLayout main = new MainLayout(this);
		setContentView(main);

		popup();
	}

	public void popup() {
		// PopupWindowインスタンスを生成
		popupWindow = new PopupWindow(this);

		/* popupWindowの背景の設定(透明の画像を設定) */
		popupWindow.setBackgroundDrawable(getResources().getDrawable(
				R.drawable.list002));

		// サイズの幅と高さを設定
		popupWindow.setWindowLayoutMode(LayoutParams.WRAP_CONTENT,
				LayoutParams.WRAP_CONTENT);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
//
//		if (event.getAction() == MotionEvent.ACTION_DOWN) {
//			if (touch == 0) {
//				touch = event.getPointerCount();
//			}
//
//			if (touch == 1) {
//				for (int i = 0; i < WindowLayoutRed.redItem.length; i++) {
//					if (v == WindowLayoutRed.redItem[i]) {
//						WindowLayoutRed.redItem[i]
//								.setImageResource(R.drawable.maru101);
//						number = i + 1;
//						touch = i+2;
//					}
//					else if (v == WindowLayoutBlue.blueItem[i]) {
//						WindowLayoutBlue.blueItem[i]
//								.setImageResource(R.drawable.maru101);
//						number = i + 1;
//						touch = i;
//					} else if (v == WindowLayoutYellow.yellowItem[0]) {
//						WindowLayoutYellow.yellowItem[i]
//								.setImageResource(R.drawable.maru101);
//						number = i + 1;
//						touch = i;
//					}
//				}
//			} else if (touch != 0) {
//
//				for (int i = 0; i < WindowLayoutRed.redItem.length; i++) {
//					if (v == WindowLayoutRed.redItem[i]) {
//						WindowLayoutRed.redItem[i]
//								.setImageResource(R.drawable.jsbitem001);
//						touch = 0;
//					}
//					else if (v == WindowLayoutBlue.blueItem[0]) {
//						WindowLayoutBlue.blueItem[i]
//								.setImageResource(R.drawable.jsbitem001);
//						touch = 0;
//					} else if (v == WindowLayoutYellow.yellowItem[0]) {
//						WindowLayoutYellow.yellowItem[i]
//								.setImageResource(R.drawable.jsbitem001);
//						touch = 0;
//					}
//				}
//			}
//
//		}

		return true;
	}

	@Override
	public void onClick(View v) {
//		} else if (v == WindowLayoutRed.okBtn || v == WindowLayoutYellow.okBtn
//				|| v == WindowLayoutBlue.okBtn) {
//			popupWindow.dismiss();
//
//			chackimage();
//
//			if (v == WindowLayoutRed.okBtn) {
//				// WindowLayoutRed.redItem01
//				// .setImageResource(R.drawable.jsbitem001);
//			} else if (v == WindowLayoutBlue.okBtn) {
//				// WindowLayoutBlue.blueItem01
//				// .setImageResource(R.drawable.jsbitem001);
//			}
//			touch = 0;
//			number = 0;
//
//			if (/* redCount == 1 && blueCount == 1 */v == WindowLayoutRed.okBtn) {
//
//				// ディスプレイのインスタンス生成
//				WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
//				Display display = wm.getDefaultDisplay();
//				float width = display.getWidth();
//
//				TranslateAnimation translateEnd = new TranslateAnimation(0,
//						width, 0, 0); // (0,0)から(100,100)に移動
//				translateEnd.setDuration(1000); // 3000msかけてアニメーションする
//
//				translateEnd.setFillAfter(true);
//
//				MainLayout.boxImageView.startAnimation(translateEnd); // アニメーション適用
//
//				final MainLayout main = new MainLayout(this);
//
//				translateEnd.setAnimationListener(new AnimationListener() {
//
//					@Override
//					public void onAnimationEnd(final Animation animation) {
//						Handler handler = new Handler();
//						handler.postDelayed(new Runnable() {
//							@Override
//							public void run() {
//								setContentView(main);
//								redCount = 0;
//								blueCount = 0;
//							}
//						}, 10);
//
//					}
//
//					@Override
//					public void onAnimationStart(Animation animation) {
//					}
//
//					@Override
//					public void onAnimationRepeat(Animation animation) {
//					}
//				});
//			}
//		}
	}

	public void chackimage() {
		// チェックボックスにチェックをつける
		for (int i = 1; i < 5; i++) {
			if (number == i && ListLayout.redItemNumber == i) {
				if (ListLayout.cbNumber01 == 1) {
					ListLayout.cb1.setImageResource(R.drawable.check_red);
				} else if (ListLayout.cbNumber02 == 2) {
					ListLayout.cb2.setImageResource(R.drawable.check_red);
				} else if (ListLayout.cbNumber03 == 3) {
					ListLayout.cb3.setImageResource(R.drawable.check_red);
				} else if (ListLayout.cbNumber04 == 4) {
					ListLayout.cb4.setImageResource(R.drawable.check_red);
				} else if (ListLayout.cbNumber05 == 5) {
					ListLayout.cb5.setImageResource(R.drawable.check_red);
				}
			}
		}

		for (int i = 1; i < 5; i++) {
			if (number == i && ListLayout.blueItemNumber == i) {
				if (ListLayout.cbNumber01 == 1) {
					ListLayout.cb1.setImageResource(R.drawable.check_blue);
				} else if (ListLayout.cbNumber02 == 2) {
					ListLayout.cb2.setImageResource(R.drawable.check_blue);
				} else if (ListLayout.cbNumber03 == 3) {
					ListLayout.cb3.setImageResource(R.drawable.check_blue);
				} else if (ListLayout.cbNumber04 == 4) {
					ListLayout.cb4.setImageResource(R.drawable.check_blue);
				} else if (ListLayout.cbNumber05 == 5) {
					ListLayout.cb5.setImageResource(R.drawable.check_blue);
				}
			}
		}

		for (int i = 1; i < 5; i++) {
			if (number == i && ListLayout.yellowItemNumber == i) {
				if (ListLayout.cbNumber01 == 1) {
					ListLayout.cb1.setImageResource(R.drawable.check_orange);
				} else if (ListLayout.cbNumber02 == 2) {
					ListLayout.cb2.setImageResource(R.drawable.check_orange);
				} else if (ListLayout.cbNumber03 == 3) {
					ListLayout.cb3.setImageResource(R.drawable.check_orange);
				} else if (ListLayout.cbNumber04 == 4) {
					ListLayout.cb4.setImageResource(R.drawable.check_orange);
				} else if (ListLayout.cbNumber05 == 5) {
					ListLayout.cb5.setImageResource(R.drawable.check_orange);
				}
			}
		}
	}

	// public void countdown() {
	//
	// if (null != cdt) {
	// cdt.cancel();
	// }
	// cdt = new CountDownTimer(31000, 1000) {
	//
	// @Override
	// public void onTick(long millisUntilFinished) {
	// timerTextView.setText("あと" + Long.toString(millisUntilFinished / 1000) +
	// "秒");
	// }
	//
	// @Override
	// public void onFinish() {
	// timerTextView.setText("あと0秒");
	// }
	// };
	// cdt.start();
	// }
}
