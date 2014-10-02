package android.demo.news.ui;

import android.demo.news.R;
import android.demo.news.logic.IdeaCodeActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class About extends IdeaCodeActivity {

	private View view;
	private TextView headTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		view = this.getLayoutInflater().inflate(R.layout.activity_about, null);
		setContentView(view);

		headTv = (TextView) findViewById(R.id.systv);
		headTv.setText(R.string.about_head_title);
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh(Object... param) {
		// TODO Auto-generated method stub

	}

}
