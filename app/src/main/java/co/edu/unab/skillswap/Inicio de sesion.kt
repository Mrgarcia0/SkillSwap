package co.edu.unab.skillswap
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.unab.skillswap.ui.theme.SkillSwapTheme

@Preview
@Composable
fun LoginScreen (){
    SkillSwapTheme{
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center) {

                Card {
                    Column(
                        modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Iniciar Sesión",
                            modifier = Modifier
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center // Centrar el texto
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Correo electrónico")
                            }, modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Contraseña")
                            }, modifier = Modifier.fillMaxWidth())

                        Spacer(modifier = Modifier.height(16.dp))

                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier.fillMaxWidth()) {
                            Text(text = "Log In")
                        }

                        OutlinedButton(onClick = {



                        },
                            modifier = Modifier.fillMaxWidth()) {
                            Text(text = "Register")
                        }

                    }
                }



            }
        }
    }
}