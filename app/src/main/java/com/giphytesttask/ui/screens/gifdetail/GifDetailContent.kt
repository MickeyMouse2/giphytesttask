package com.giphytesttask.ui.screens.gifdetail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giphytesttask.ui.common.GifItemOriginal
import com.giphytesttask.ui.screens.gifdetail.viewmodel.GifDetailState
import com.giphytesttask.ui.theme.GiphyTestTaskTheme

@Composable
internal fun GifDetailContent(
    state: GifDetailState = GifDetailState(),
    invokes: GifDetailScreenInvokes = GifDetailScreenInvokes(),
    navigation: GifDetailScreenNavigation = GifDetailScreenNavigation()
) {
    Box(modifier = Modifier.wrapContentSize().defaultMinSize(200.dp, 200.dp)) {
        GifItemOriginal(modifier = Modifier.defaultMinSize(200.dp, 200.dp), item = state.gif)
    }
}

@Preview
@Composable
internal fun GifDetailContentPreview() {

    GiphyTestTaskTheme {
        Surface(modifier = Modifier.wrapContentSize().defaultMinSize(200.dp, 200.dp)) {
            GifDetailContent()
        }
    }
}