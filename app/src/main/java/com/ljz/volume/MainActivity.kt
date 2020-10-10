package com.ljz.volume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ljz.volume.utils.AudioMngHelper

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.increase_music).setOnClickListener(this)
        findViewById<View>(R.id.decrease_music).setOnClickListener(this)
        findViewById<View>(R.id.increase_alarm).setOnClickListener(this)
        findViewById<View>(R.id.decrease_alarm).setOnClickListener(this)
        findViewById<View>(R.id.increase_ring).setOnClickListener(this)
        findViewById<View>(R.id.decrease_ring).setOnClickListener(this)
        findViewById<View>(R.id.increase_call).setOnClickListener(this)
        findViewById<View>(R.id.decrease_call).setOnClickListener(this)
        findViewById<View>(R.id.increase_system).setOnClickListener(this)
        findViewById<View>(R.id.decrease_system).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v!!.id
        val audioMngHelper = AudioMngHelper(this)
        when(id) {
            R.id.increase_music -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_MUSIC)
                audioMngHelper.addVoice100()
            }
            R.id.decrease_music -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_MUSIC)
                audioMngHelper.subVoice100()
            }
            R.id.increase_alarm -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_ALARM)
                audioMngHelper.addVoice100()
            }
            R.id.decrease_alarm -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_ALARM)
                audioMngHelper.subVoice100()
            }
            R.id.increase_ring -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_RING)
                audioMngHelper.addVoice100()
            }
            R.id.decrease_ring -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_RING)
                audioMngHelper.subVoice100()
            }
            R.id.increase_call -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_CALL)
                audioMngHelper.addVoice100()
            }
            R.id.decrease_call -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_CALL)
                audioMngHelper.subVoice100()
            }
            R.id.increase_system -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_SYSTEM)
                audioMngHelper.addVoice100()
            }
            R.id.decrease_system -> {
                audioMngHelper.setAudioType(AudioMngHelper.TYPE_SYSTEM)
                audioMngHelper.subVoice100()
            }
        }
    }

    fun volumeController() {

    }
}