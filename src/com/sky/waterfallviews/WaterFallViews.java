package com.sky.waterfallviews;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import android.widget.ImageView.ScaleType;

public class WaterFallViews extends ScrollView {

	private String[] url = {
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg",
			"http://pic31.nipic.com/20130630/12266309_223825307117_2.jpg",
			"http://pic28.nipic.com/20130425/11851724_233351407130_2.jpg",
			"http://img4.duitang.com/uploads/item/201408/17/20140817174231_mtxVW.jpeg",
			"http://p4.qqgexing.com/shaitu/2012/07/04/15/4ff3f5c978a47.jpg",
			"http://img4.duitang.com/uploads/item/201310/28/20131028191129_8JuKR.jpeg",
			"http://f4.topit.me/4/c2/24/110876245462624c24o.jpg" };

	private static int PAGE_COUNT = 15;// 定义每页加载数
	private int PAGE = 0;// 当前加载到第几页

	private int firstHeight = 0;
	private int secondtHeight = 0;
	private int thirdtHeight = 0;

	private LinearLayout first = null;
	private LinearLayout second = null;
	private LinearLayout third = null;

	private int columnWidth = 0;// 列宽
	private boolean isFirstLoaded = true;// 是否第一次加载
	private ImageLoader mImageLoader = null;
	private View all_container = null;
	private WaterFallViews mWaterFallViews = null;
	private LinearLayout[] child = null;
	private int scrollViewHeight = 0;
	private List<String> mUrls = null;

	private int left = 5;
	private int right = 5;
	private int top = 5;
	private int bottom = 5;

	public WaterFallViews(Context context, AttributeSet attrs) {
		super(context, attrs);
		mImageLoader = ImageLoader.getInstance();
		all_container = this;
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		super.onLayout(changed, l, t, r, b);
		if (isFirstLoaded && changed) {
			scrollViewHeight = getHeight();
			all_container = getChildAt(0);
			mUrls = new ArrayList<String>();
			first = (LinearLayout) all_container.findViewById(R.id.first);
			second = (LinearLayout) all_container.findViewById(R.id.second);
			third = (LinearLayout) all_container.findViewById(R.id.third);
			isFirstLoaded = false;
			columnWidth = first.getWidth();
			loadMoreImg();
		}
	}

	public Bitmap loadImage(String url) {
		if (null == url)
			return null;
		Bitmap bitmap = null;
		bitmap = mImageLoader.getBitmapFromMemoryCache(url);// 从内存拿图片
		if (null != bitmap) {
			return bitmap;
		}

		// 从SD卡拿图片
		File imgFile = new File(Utils.getImagePath(url));
		if (!imgFile.exists()) {
			Utils.downloadImage(url, columnWidth);// 网络下载图片
		}

		bitmap = ImageLoader.decodeSampledBitmapFromResource(imgFile.getPath(),
				columnWidth - 10);
		return bitmap;
	}

	private class ImageLoadTask extends AsyncTask<String, Void, Bitmap> {

		@Override
		protected Bitmap doInBackground(String... params) {
			// 子线程 加载图片
			return loadImage(params[0]);
		}

		@Override
		protected void onPostExecute(Bitmap result) {
			super.onPostExecute(result);
			// 显示图片
			if (null != result) {
				double ratio = result.getWidth() * 1.0 / columnWidth;
				int scaledHeight = (int) (result.getHeight() / ratio);
				addImageToLayout(result, columnWidth, scaledHeight);
			}
		}
	}

	public void addImageToLayout(Bitmap bm, int width, int height) {
		// 添加图片 -- 显示
		ImageView iv = new ImageView(getContext());
		iv.setImageBitmap(bm);
		iv.setScaleType(ScaleType.FIT_XY);
		iv.setPadding(left, top, right, bottom);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width,
				height);
		iv.setLayoutParams(params);

		addToMinLayout(iv, height);

	}

	private void addToMinLayout(ImageView iv, int height) {
		if (firstHeight <= secondtHeight) {
			if (firstHeight <= thirdtHeight) {// 第一个最小
				first.addView(iv);
				firstHeight += height;
			} else {
				third.addView(iv);
				thirdtHeight += height;
			}
		} else {
			if (secondtHeight <= thirdtHeight) {// 第一个最小
				second.addView(iv);
				secondtHeight += height;
			} else {
				third.addView(iv);
				thirdtHeight += height;
			}
		}
	}

	private void showToast(String str) {
		Toast.makeText(getContext(), str, Toast.LENGTH_SHORT).show();
	}

	private void loadMoreImg() {
		if (Utils.hasSDCard()) {// 分页加载
			int startIndex = PAGE * PAGE_COUNT;// 起始点
			int endIndex = startIndex + PAGE_COUNT;// 结束点
			if (startIndex > mUrls.size()) {
				showToast("没有更多...");
				return;
			}
			if (endIndex > mUrls.size()) {
				endIndex = mUrls.size();
			}

			// for (int i = startIndex; i < endIndex; i++) {
			// // 加载图片 1.内存 2.SD卡 3.网络
			// ImageLoadTask task = new ImageLoadTask();
			// task.execute(mUrls.get(i));// 传递Url
			// }

			for (int i = 0; i < url.length; i++) {
				// 加载图片 1.内存 2.SD卡 3.网络
				ImageLoadTask task = new ImageLoadTask();
				task.execute(url[i]);// 传递Url
			}

		}
	}
}
