package com.sky.waterfallviews;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.graphics.Bitmap;
import android.os.Environment;

public class Utils {

	// ≈–∂œ «∑Ò”–SDø®
	public static boolean hasSDCard() {
		return Environment.MEDIA_MOUNTED.equals(Environment
				.getExternalStorageState());
	}

	// Ω≤Õº∆¨œ¬‘ÿµΩSDø®ª∫¥Ê
	public static void downloadImage(String imgUrl, int columnWidth) {
		if (columnWidth <= 0)
			return;
		if (null == imgUrl)
			return;
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {

		} else {

		}
		HttpURLConnection con = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		BufferedInputStream bis = null;
		File imageFile = null;

		try {
			URL url = new URL(imgUrl);
			con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5 * 1000);
			con.setReadTimeout(15 * 1000);
			con.setDoInput(true);
			con.setDoOutput(true);
			bis = new BufferedInputStream(con.getInputStream());
			imageFile = new File(getImagePath(imgUrl));
			fos = new FileOutputStream(imageFile);
			bos = new BufferedOutputStream(fos);
			byte[] b = new byte[1024];
			int length = 0;
			while ((length = bis.read(b)) != -1) {
				bos.write(b, 0, length);
				bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != bis) {
					bis.close();
				}
				if (null != bos) {
					bos.close();
				}
				if (null != con) {
					con.disconnect();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (null != imageFile) {
			Bitmap bitmap = ImageLoader.decodeSampledBitmapFromResource(
					imageFile.getPath(), columnWidth);
			if (null != bitmap) {
				ImageLoader imageLoader = ImageLoader.getInstance();
				imageLoader.addBitmapToMemoryCache(imgUrl, bitmap);
			}
		}
	}

	public static String getImagePath(String imgUrl) {
		int lastSlashIndex = imgUrl.lastIndexOf("/");
		String imgName = imgUrl.substring(lastSlashIndex + 1);
		String imgDir = Environment.getExternalStorageDirectory().getPath()
				+ "/WaterFalls/";// ª∫¥Ê¬∑æ∂
		File file = new File(imgDir);
		if (!file.exists()) {
			file.mkdirs();
		}
		String imgPath = imgDir + imgName;
		return imgPath;
	}

}
