package com.epicgames.ue4;

import com.YourCompany.Element54.OBBDownloaderService;
import com.YourCompany.Element54.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

