package com.sky.waterfallviews;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.LruCache;

public class ImageLoader {

	// ͼƬ���������
	private static LruCache<String, Bitmap> mMemoryCache = null;

	private volatile static ImageLoader mImageLoader = null;

	// ���췽��
	private ImageLoader() {
		int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 8);
		mMemoryCache = new LruCache<String, Bitmap>(maxMemory) {
			protected int sizeOf(String key, Bitmap bitmap) {
				return bitmap.getByteCount();
			};
		};
	}

	// ����ģʽ��ȡʵ��
	public static ImageLoader getInstance() {
		if (null == mImageLoader) {
			newInstance();
		}
		return mImageLoader;
	}

	private synchronized static void newInstance() {// ���ǵ����߳�
		if (null == mImageLoader) {
			mImageLoader = new ImageLoader();
		}
	}

	//����ѹ������
	public static int caculateInSampleSize(BitmapFactory.Options options,
			int reqWidth) {
		// ԴͼƬ�Ŀ��
		final int width = options.outWidth;
		int inSampleSize = 1;
		if (reqWidth < width) {
			final int widthRatio = Math.round((float) (width * 1.0 / reqWidth));
			inSampleSize = widthRatio;
		}
		return inSampleSize;
	}

	//���ͼƬ���ڴ�
	public void addBitmapToMemoryCache(String key, Bitmap bitmap) {
		if (null == getBitmapFromMemoryCache(key)) {
			mMemoryCache.put(key, bitmap);
		}
	}

	//���ڴ���ͼƬ
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
