package com.liangxiao.ImageLunBo;


import com.liangxiao.fastscroll.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {
	private ViewFlow viewFlow;
	private static final int[] ids = { R.drawable.test1, R.drawable.test2,
			R.drawable.test3, R.drawable.ic_launcher };
	// 网络图片部分
	private String[] urls = {
			"http://img0.bdstatic.com/img/image/shouye/gxstc-11823297096.jpg",
			"http://img0.bdstatic.com/img/image/shouye/mnwlmn-9569205918.jpg",
			"http://img0.bdstatic.com/img/image/shouye/syjw-9631106372.jpg",
			"http://img0.bdstatic.com/img/image/shouye/fsfss001.jpg" };
	// 本地图片
	private int[] urls_loaction = { R.drawable.test1, R.drawable.test1,
			R.drawable.test1, R.drawable.test1 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.lunbo_image_activity_main);

		viewFlow = (ViewFlow) findViewById(R.id.viewflow);
		viewFlow.setAdapter(new ImageAdapter(this, urls));
		viewFlow.setmSideBuffer(ids.length); // 实际图片张数， 我的ImageAdapter实际图片张数为3

		CircleFlowIndicator indic = (CircleFlowIndicator) findViewById(R.id.viewflowindic);
		viewFlow.setFlowIndicator(indic);
		viewFlow.setTimeSpan(2000);
		viewFlow.setSelection(3 * 1000); // 设置初始位置
		viewFlow.startAutoFlowTimer(); // 启动自动播放

	}

}
