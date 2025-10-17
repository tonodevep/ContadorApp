# 📱 Contador Compose

Una app minimalista desarrollada con Jetpack Compose que demuestra los fundamentos del desarrollo móvil en Android con un simple contador.

---

## 🧾 Datos del proyecto

- **📛 Nombre:** Contador
- **👤 Autor/a:** Juan Antonio "Toño" Tejera
- **📅 Fecha:** 17 de octubre de 2025
- **📱 Versión Android:** targetSdk 34, minSdk 24

---

## ⚙️ Tecnología elegida y por qué

- **🛠️ Jetpack Compose (Kotlin)**
- **💡 Justificación:** Compose permite construir interfaces modernas de forma declarativa, con menos código y mayor claridad. Ideal para apps pequeñas como ésta con lógica de estado simple.

---

## 🧪 Configuración del entorno y ejecución

1. 🔽 Instala Android Studio (versión Hedgehog o superior).
2. 🆕 Crea un nuevo proyecto con plantilla "Empty Compose Activity".
3. 📦 Configura el SDK: targetSdk 34, minSdk 24.
4. 📱 Conecta un dispositivo físico o inicia un emulador desde AVD Manager.
5. ▶️ Ejecuta la app con el botón "Run".

---

## 📁 Estructura del proyecto

ContadorCompose/
├── app/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/example/contador/
│ │ │ │ └── MainActivity.kt → lógica principal y UI
│ │ │ └── res/
│ │ │ └── values/
│ │ │ └── themes.xml → configuración de tema
├── build.gradle → dependencias y configuración del proyecto
└── settings.gradle → configuración de módulos

---

## 📲 Perfil de despliegue

- **🧩 SDK:** Android 16 (API 36.0)
- **📱 Dispositivo:** Pixel 9 (emulador)
- **🖼️ Resolución:** 1080 × 2400 px
- **🔍 Densidad:** xxhdpi

---

## 🎯 Funcionamiento de la app

- ✅ Muestra un número inicial (0).
- ➕ Botón **+** incrementa el valor.
- ➖ Botón **−** decrementa el valor.
- 🔄 Botón **Reset** reinicia a 0.
- 🎉 Al llegar a 10, muestra el mensaje: `¡Meta conseguida por Toño :)!`.

### 🖼️ Captura de pantalla

<img width="1080" height="2424" alt="TejeraJuanAntonio_actEv_ut1_app_contador" src="https://github.com/user-attachments/assets/393013ca-e85e-4dda-ba86-41636b990e78" />

---

## ✅ Conclusión y limitaciones

**📚 Lo aprendido:**
- Configuración básica de Jetpack Compose.
- Uso de `@Composable` y `remember { mutableStateOf() }`.
- Estructura moderna de proyectos Android.

**⚠️ Limitaciones encontradas:**
- El emulador tarda en iniciar en equipos con pocos recursos como el mío.

---

## Autor
Este proyecto ha sido desarrollado por Juan Antonio "Toño" Tejera González.  

Github de Toño: [![Web](https://img.shields.io/badge/GitHub-tonodevep-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/tonodevep/)


