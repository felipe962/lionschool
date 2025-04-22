package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoursesScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 30.dp, horizontal = 10.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = stringResource(R.string.imagem),
                    painter = painterResource(id = R.drawable.logoimage),
                    modifier = Modifier
                        .width(50.dp)
                        .height(50.dp)
                )
                Column() {
                    Text(
                        text = stringResource(R.string.lion_nome),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                    Text(
                        modifier = Modifier
                            .padding(bottom = 5.dp),
                        text = stringResource(R.string.school_nome),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF3347B0)
                    )
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 25.dp),
                color = Color(0xFFFFC23D)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp),
                shape = RoundedCornerShape(50.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFFFFC23D),
                ),
                label = {
                    Text(
                        modifier = Modifier.fillMaxHeight(),
                        text = stringResource(R.string.label_courses),
                        fontSize = 14.sp
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = ""
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    capitalization = KeyboardCapitalization.Words
                )
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp, start = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    contentDescription = "",
                    painter = painterResource(id = R.drawable.watchlater),
                    modifier = Modifier
                        .width(35.dp)
                        .height(35.dp)
                )
                Text(
                    modifier = Modifier.padding(start = 5.dp),
                    text = stringResource(R.string.courses),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp,
                    color = Color(0xFF3347B0)
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(260.dp)
                        .padding(top = 10.dp, bottom = 10.dp),
                    border = BorderStroke(1.dp, Color(0xFFFFC23D)),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 7.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFF3347B0),
                                        Color(0xFFCFD4EA)
                                    )
                                )
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 25.dp, top = 20.dp, bottom = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                contentDescription = "",
                                painter = painterResource(R.drawable.programming),
                                modifier = Modifier
                                    .size(100.dp)
                            )
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 15.dp),
                                text = stringResource(R.string.desenvolvimento_de_sistemas),
                                fontSize = 80.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFFFC23D)
                            )
                        }
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 25.dp),
                            text = stringResource(R.string.description_course_ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 25.dp, top = 3.dp),
                            text = stringResource(R.string.description_course_ds),
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 25.dp, top = 20.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                contentDescription = "",
                                painter = painterResource(R.drawable.lionchip)
                            )
                            Text(
                                modifier = Modifier
                                    .padding(start = 3.dp),
                                text = stringResource(R.string.semesters),
                                fontSize = 12.sp,
                                color = Color.White
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(260.dp)
                        .padding(top = 10.dp, bottom = 10.dp)
                ) {}

                Card(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .height(260.dp)
                        .padding(top = 10.dp, bottom = 10.dp)
                ) {}
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CoursesScreenPreview() {
    CoursesScreen()
}