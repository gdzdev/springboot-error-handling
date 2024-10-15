# 🌱 Spring Boot Error Handling 🌱

Este proyecto es una implementación simple que demuestra cómo manejar errores en una aplicación **Spring Boot**. El objetivo es capturar excepciones comunes y personalizadas, devolviendo respuestas estructuradas en caso de errores en la API.

## 📜 Descripción del Proyecto

El proyecto incluye un controlador global que maneja las excepciones lanzadas por la API. Utiliza excepciones personalizadas, como `UserNotFoundException`, para proporcionar mensajes claros y amigables al usuario.

### ✨ Funcionalidades:

- **Manejo Global de Excepciones**: Captura excepciones y devuelve respuestas formateadas en JSON.
- **Excepciones Personalizadas**: Maneja casos específicos como la ausencia de un usuario.
- **Interacción con Usuarios**: Permite obtener la lista de usuarios y buscar un usuario por ID.
- **Endpoint de Bienvenida**: Proporciona un mensaje de bienvenida y un ejemplo de manejo de errores.

## ⚙️ Endpoints Principales

- **/app**: Mensaje de bienvenida.
- **/users**: Lista de todos los usuarios.
- **/users/{id}**: Información del usuario por ID.

## 🛠️ Dependencias Principales

- **Spring Boot Starter Web**: Para crear la API REST.
- **Lombok**: Para reducir el código repetitivo.
- **Spring Boot DevTools**: Para mejorar el flujo de desarrollo.

---

¡Disfruta aprendiendo sobre el manejo de errores en Spring Boot! 🚀
