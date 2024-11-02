package com.miragessee.library

import com.miragessee.library.java.interfaces.OnCountdownCompleted

/**
 * Start countdown and invoke callback when it's ended
 */
fun PulseCountDown.start(callback: () -> Unit = {}) = start(OnCountdownCompleted { callback() })