package com.aedifexforge.testwallpaper

import android.service.wallpaper.WallpaperService
import com.aedifexforge.testwallpaper.MyIntentService.MyWallpaperEngine

class MyIntentService : WallpaperService() {
    override fun onCreateEngine(): Engine {
        return MyWallpaperEngine()
    }

    private inner class MyWallpaperEngine : Engine()
}