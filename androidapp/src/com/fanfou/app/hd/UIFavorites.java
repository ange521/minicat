package com.fanfou.app.hd;

import com.fanfou.app.hd.service.Constants;
import com.fanfou.app.hd.ui.BaseTimlineFragment;
import com.fanfou.app.hd.ui.UserFavoritesFragment;
import com.fanfou.app.hd.ui.UserTimelineFragment;

/**
 * @author mcxiaoke
 * @version 1.0 2012.02.08
 *
 */
public class UIFavorites extends CommonUITimeline {

	@Override
	protected int getType() {
		return Constants.TYPE_FAVORITES_LIST;
	}

	@Override
	protected BaseTimlineFragment getFragment(String userId) {
		return UserFavoritesFragment.newInstance(userId);
	}

}
