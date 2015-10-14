package com.sky.waterfallviews;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.LruCache;

public class ImageLoader {

	// 图片缓存核心类
	private static LruCache<String, Bitmap> mMemoryCache = null;

	private volatile static ImageLoader mImageLoader = null;

	// 构造方法
	private ImageLoader() {
		int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 8);
		mMemoryCache = new LruCache<String, Bitmap>(maxMemory) {
			protected int sizeOf(String key, Bitmap bitmap) {
				return bitmap.getByteCount();
			};
		};
	}

	// 单例模式获取实例
	public static ImageLoader getInstance() {
		if (null == mImageLoader) {
			newInstance();
		}
		return mImageLoader;
	}

	private synchronized static void newInstance() {// 考虑到多线程
		if (null == mImageLoader) {
			mImageLoader = new ImageLoader();
		}
	}

	//计算压缩比例
	public static int caculateInSampleSize(BitmapFactory.Options options,
			int reqWidth) {
		// 源图片的宽高
		final int width = options.outWidth;
		int inSampleSize = 1;
		if (reqWidth < width) {
			final int widthRatio = Math.round((float) (width * 1.0 / reqWidth));
			inSampleSize = widthRatio;
		}
		return inSampleSize;
	}

	//添加图片到内存
	public void addBitmapToMemoryCache(String key, Bitmap bitmap) {
		if (null == getBitmapFromMemoryCache(key)) {
			mMemoryCache.put(key, bitmap);
		}
	}

	//从内存拿图片
	public Bitmap getBitmapFromMemoryCache(String key) {
		return mMemoryCache.get(key);
	}

	public static Bitmap decodeSampledBitmapFromResource(String pathName,
			int reqWidth) {
		final BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeFile(pathName, options);
		options.inSampleSize = caculateInSampleSize(options, reqWidth);
		options.inJustDecodeBounds = false;
		return BitmapFactory.decodeFile(pathName, options);
	}
}
