package com.example.composetutourials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutourials.ui.theme.ComposeTutourialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(Message("Okello", "Learning","Compose"))
        }
    }
}

data class Message(val author:String,val body:String, val detail:String)

@Composable
fun Greeting(msg: Message) {
  Row{
      Image(painter = painterResource(id = R.drawable.unnamed),
          contentDescription ="okello Profile",
          modifier= Modifier
              .size(60.dp) //set Image sire to 60dp
              .clip(CircleShape) //clip image to be shaped as a circle
          )

      Spacer(modifier =Modifier.width(8.dp)) // adding Horizontal space between image ancolumn
      Column {
           Text(text = msg.author)
          Text(text= msg.body)
          
          Spacer(modifier = Modifier.height(4.dp))
          Text(text= msg.detail)
      }
  }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutourialsTheme {
        Greeting(
            msg = Message("hey", "compose" ,"by Okello")
        )
    }
}