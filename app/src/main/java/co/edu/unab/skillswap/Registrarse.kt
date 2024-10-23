package co.edu.unab.skillswap

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.unab.skillswap.ui.theme.SkillSwapTheme

@Preview
@Composable
fun RegisterScreen() {
    SkillSwapTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->

            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {

                Card {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(text = "Registrarse")

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Nombre")
                            }, modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Apellidos")
                            }, modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Correo Electronico")
                            }, modifier = Modifier.fillMaxWidth()
                        )

                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Contraseña")
                            }, modifier = Modifier.fillMaxWidth()
                        )

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth()) {
                            Text(text = "Register")
                        }


                    }
                }


            }

        }
    }
}
