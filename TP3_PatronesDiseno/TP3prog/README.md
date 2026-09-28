# TP3 – Patrones de Diseño (Programación II)

Implementación de 6 patrones de diseño (3 creacionales + 3 estructurales)
en Java, cada uno con un ejemplo propio y contextualizado:

| # | Patrón            | Escenario elegido                              |
|---|--------------------|-------------------------------------------------|
| 1 | Singleton          | Gestor de conexión a la BD de un sistema bancario |
| 2 | Factory Method     | Concesionaria Toyota: fábricas de vehículos por modelo (Hilux/Corolla) |
| 3 | Abstract Factory   | Concesionaria multimarca: combos Sedán+Pickup de Chevrolet y Toyota |
| 4 | Adapter            | Velocímetro unificado: Hilux generación nueva y generación vieja (adaptada) |
| 5 | Decorator          | Equipamiento de un personaje de RPG              |
| 6 | Facade             | Proceso de compra de una tienda online           |

## Estructura del proyecto

```
TP3_PatronesDiseno/
├── informe.md                     # Planteo, justificación y UML de cada patrón
├── README.md
└── src/com/tp3/
    ├── singleton/
    ├── factorymethod/
    ├── abstractfactory/
    ├── adapter/
    ├── decorator/
    └── facade/
```

Cada paquete contiene su propia clase `Main` ejecutable que demuestra el
patrón correspondiente.

## Cómo compilar y ejecutar

Requiere tener instalado un JDK (11 o superior; se recomienda 17+).

Desde la carpeta raíz del proyecto:

```bash
# Compilar todo el proyecto
mkdir -p bin
javac -d bin $(find src -name "*.java")

# Ejecutar cada ejercicio
java -cp bin com.tp3.singleton.Main
java -cp bin com.tp3.factorymethod.Main
java -cp bin com.tp3.abstractfactory.Main
java -cp bin com.tp3.adapter.Main
java -cp bin com.tp3.decorator.Main
java -cp bin com.tp3.facade.Main
```

En Windows (PowerShell), reemplazar el `find` por:

```powershell
javac -d bin (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName })
```

## Diagramas UML

Los diagramas de clases de cada patrón están en `informe.md`, escritos en
sintaxis Mermaid (se visualizan automáticamente en GitHub o en cualquier
visor Markdown compatible con Mermaid, como VS Code con la extensión
"Markdown Preview Mermaid Support").
