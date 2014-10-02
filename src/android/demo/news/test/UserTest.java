package android.demo.news.test;

import android.demo.news.app.AppException;
import android.demo.news.module.util.MemberUtil;
import android.test.AndroidTestCase;

public class UserTest extends AndroidTestCase {

	private static final String TAG = "UserTest";

	// public void getUserCommentList() throws AppException{
	// long userId = new Long("121114232130");
	// Paging p = new Paging(1,20);
	// boolean isRefresh = true;
	// MemberUtil.getUserCommentList(this.getContext(),userId,p,isRefresh);
	// }

	public void getUserInfo() throws AppException {
		long userId = new Long("121114232130");
		MemberUtil.getUserInfo(userId);
	}
}
