package com.dhirajgupta.glitchy.ui.transform

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransformViewModel : ViewModel() {

    private val _texts = MutableLiveData<List<String>>().apply {
        value = listOf(
            "animated_loop_interlaced.gif",
            "animated_loop_variable_delay.gif",
            "animated_loop.gif",
            "animated_noloop.gif",
            "animated_transparent_firstframerestoreprev_loop.gif",
            "animated_transparent_frame_norestore_loop.gif",
            "animated_transparent_frame_restorebackground_loop.gif",
            "animated_transparent_frame_restoreprev_loop.gif",
            "animated_transparent_loop_frames_out_of_bounds.gif",
            "animated_transparent_loop.gif",
            "animated_transparent_restoreprev_loop.gif",
            "static_nontransparent.gif",
            "static_transparent.gif",
            "CnqiS1I.gif",
            "golf_01_anim.gif",
            "CleverBareCornsnake-size_restricted.gif",
            "697b023b-64a5-49a0-8059-27b963453fb1.gif",
            "855.gif",
            "breakdancing_together.gif",
            "giphy-1.gif",
            "giphy.gif",
            "ConfusedVelvetyAsiansmallclawedotter-size_restricted.gif",
        )
    }

    val texts: LiveData<List<String>> = _texts
}


