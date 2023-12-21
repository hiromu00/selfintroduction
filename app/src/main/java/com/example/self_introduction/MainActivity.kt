package com.example.self_introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.self_introduction.ui.theme.SelfintroductionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SelfintroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ff),
                            contentDescription = "プロフィール",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "肥後大夢",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "職業：システムエンジニア",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Gooooogle",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "ウルトラショックレーザー",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(20.dp))

                            Label(icon = Icons.Default.Email, text = "email")

                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "LOL@ezweb.ne.jp",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(5.dp))

                            Divider(
                                modifier = Modifier.clip(RoundedCornerShape(1000.dp)),
                                thickness = 2.dp,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(
                                        0xFFF85F6A
                                    )
                                ),
                                onClick = { /*TODO*/ },
                            ) {
                                Text(
                                    text = "詳細を表示",
                                    color = Color.White,

                                    )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(Color.LightGray.copy(alpha = 0.3f))
                                    .padding(horizontal = 10.dp, vertical = 20.dp)
                            ) {
                                Label(
                                    icon = Icons.Default.Favorite,
                                    text = "リーグオブレジェンド",
                                    color = Color.Gray,
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Label(
                                    icon = Icons.Default.LocationOn,
                                    text = "住所：東京都志茂",
                                    color = Color.Gray,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Label(icon: ImageVector, text: String, color: Color = MaterialTheme.colors.onBackground) {

    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = icon,
            contentDescription = null,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = text,
            color = color,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
