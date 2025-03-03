# 🚀 Proyecto de Gestión de la Configuración
  📌 **Materia:** Gestión de la Configuración  
  📌**Objetivo:** Implementar un pipeline CI/CD en GitHub Actions para gestionar la compilación, revisión y despliegue de una aplicación.

## Descripción del Proyecto
Este repositorio contiene una aplicación configurada con GitHub Actions, que automatiza el proceso de compilación, pruebas y despliegue mediante dos flujos de trabajo:

#### 1️⃣ CI/CD Workflow (ci-cd.yml)
+  Se activa en cada push o pull request a main.
+  Realiza revisión del código, compilación y verificación de pruebas.
+  Construye la imagen Docker.
+  Se encarga de preparar el proyecto para su despliegue.

#### 2️⃣ Release Workflow (release.yml)
+  Se activa al crear un tag de versión (v1.0.0, v1.1.0, etc.).
+  Genera un release en GitHub con el .jar compilado.
+  Construye y publica la imagen Docker en Docker Hub.
+  Permite obtener una versión estable y etiquetada del proyecto.

#### 🔧 Tecnologías Utilizadas
  ✅ Java 21 (Temurin)
  ✅ Maven
  ✅ GitHub Actions
  ✅ Docker & Docker Hub

#### 📂 Estructura del Repositorio

📦 gestiondelaconfiguracion  
├── 📁 MyApiApplication        # Código fuente del proyecto  
│   ├── pom.xml               # Archivo de configuración de Maven  
│   └── src/                  # Código fuente  
├── 📁 .github/workflows      # Workflows de CI/CD en GitHub Actions  
│   ├── ci-cd.yml             # Flujo de integración y compilación  
│   └── release.yml           # Flujo de generación de releases y despliegue  
├── 📜 README.md              # Documentación del proyecto  

## 🚀 ¿Cómo Funciona el Pipeline?

#### 1️⃣ CI/CD Workflow (ci-cd.yml)

Cada vez que se sube código a main, GitHub Actions ejecuta:  
✅ Descarga el código (checkout).  
✅ Configura Java y Maven.  
✅ Compila la aplicación con mvn clean package.  
✅ Ejecuta pruebas y validaciones.  
✅ Construye la imagen Docker (pero NO la sube a Docker Hub).  

📌 Se encarga de verificar el código antes de un release.  

#### 2️⃣ Release Workflow (release.yml)

Cuando se crea un tag de versión, este flujo ejecuta:  
✅ Compilación con Maven.  
✅ Creación de un release en GitHub con el .jar.  
✅ Construcción de una imagen Docker con la versión (vX.Y.Z).  
✅ Subida de la imagen a Docker Hub (myapi:vX.Y.Z).  
