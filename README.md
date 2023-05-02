#Tarea27 Spring REST JWT

# Project: UD27
# 📁 Collection: Ejercicio1 


## End-point: LOGIN
### Method: POST
>```
>http://localhost:8181/api/auth/signin
>```
### Body (**raw**)

```json
{
    "username": "Laurelindorean",
    "password": "123456"
}
```

### Response: 200
```json
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJMYXVyZWxpbmRvcmVhbiIsImlhdCI6MTY4Mjk3ODc0MCwiZXhwIjoxNjgzMDY1MTQwfQ.rzkbzdPSUt4k-Z1YUS8KbkrTktPdYUBxk3REJOJ3ftVr1zkEajs_So0yIRcDTXBEhfuyW38pVD01d5WjGXrwWA",
    "type": "Bearer",
    "username": "Laurelindorean"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE USER
### Method: POST
>```
>http://localhost:8181/api/auth/signup
>```
### Body (**raw**)

```json
{
    "username": "Laurelindorean",
    "password": "123456"
}
```

### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/piezas
>```
### 🔑 Authentication bearer

|Param|value|Type|
|---|---|---|
|token|eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJNaWd1ZWwiLCJpYXQiOjE2ODI5NzI5MzUsImV4cCI6MTY4MzA1OTMzNX0.GaHueLksHWu6xMQDz39gqyHGeYpeDiN9TD5u3EQkpxsNi47pR6qYeOdIdJ17N75R4JIjc8isrgYhRAy37b0t6A|string|


### Response: 200
```json
Without body
```
[
    {
        "codigo": 1,
        "nombre": "Tuerca"
    },
    {
        "codigo": 2,
        "nombre": "Tornillo"
    },
    {
        "codigo": 3,
        "nombre": "Punta"
    },
    {
        "codigo": 4,
        "nombre": "Arandela"
    },
    {
        "codigo": 5,
        "nombre": "Valvula"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/proveedores
>```
### Response: 200
```json
[
    {
        "id": "4Tue",
        "nombre": "LasTuercas"
    },
    {
        "id": "6Ho9",
        "nombre": "Valvula caliente"
    },
    {
        "id": "GaDa",
        "nombre": "Gandalf El Blanco"
    },
    {
        "id": "PePe",
        "nombre": "FerreteríaPepe"
    },
    {
        "id": "S.Hw",
        "nombre": "SuperFerreteria"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/suministra
>```
### Response: 200
```json
[
    {
        "id": 1,
        "precio": 20,
        "pieza": {
            "codigo": 1,
            "nombre": "Tuerca"
        },
        "proveedor": {
            "id": "PePe",
            "nombre": "FerreteríaPepe"
        }
    },
    {
        "id": 2,
        "precio": 20,
        "pieza": {
            "codigo": 2,
            "nombre": "Tornillo"
        },
        "proveedor": {
            "id": "GaDa",
            "nombre": "Gandalf El Blanco"
        }
    },
    {
        "id": 3,
        "precio": 20,
        "pieza": {
            "codigo": 2,
            "nombre": "Tornillo"
        },
        "proveedor": {
            "id": "S.Hw",
            "nombre": "SuperFerreteria"
        }
    },
    {
        "id": 4,
        "precio": 20,
        "pieza": {
            "codigo": 4,
            "nombre": "Arandela"
        },
        "proveedor": {
            "id": "S.Hw",
            "nombre": "SuperFerreteria"
        }
    },
    {
        "id": 5,
        "precio": 20,
        "pieza": {
            "codigo": 5,
            "nombre": "Valvula"
        },
        "proveedor": {
            "id": "6Ho9",
            "nombre": "Valvula caliente"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Ejercicio2 


## End-point: LOGIN
### Method: POST
>```
>http://localhost:8181/api/auth/signin
>```
### Body (**raw**)

```json
{
    "username": "Palmira",
    "password": "pass"
}
```

### Response: 200
```json
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWxtaXJhIiwiaWF0IjoxNjgyOTg2NTIzLCJleHAiOjE2ODMwNzI5MjN9.c5meT2U68m4a45f1GjP5jQuKP42ASiK1k7p9PhKN-1XLiwjg2P4dEi1yy-NiLFYKaU3CMzm44Zm-D4R21x8lpA",
    "type": "Bearer",
    "username": "Palmira"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE USER
### Method: POST
>```
>http://localhost:8181/api/auth/signup
>```
### Body (**raw**)

```json
{
    "username": "Palmira",
    "password": "pass"
}
```

### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/cientificos
>```
### Response: 200
```json
[
    {
        "dni": "0000000S",
        "nomApels": "Gordon Freeman"
    },
    {
        "dni": "1111111S",
        "nomApels": "Michael Newman"
    },
    {
        "dni": "2222222S",
        "nomApels": "Rogrigo García"
    },
    {
        "dni": "3333333S",
        "nomApels": "Redbull Daalas"
    },
    {
        "dni": "4444444S",
        "nomApels": "Maravillas Martínez"
    },
    {
        "dni": "5555555S",
        "nomApels": "Núria Style"
    },
    {
        "dni": "6666666S",
        "nomApels": "Arrebato Liendre"
    },
    {
        "dni": "7777777S",
        "nomApels": "Xavier Cassanyes"
    },
    {
        "dni": "8888888S",
        "nomApels": "Razones Grandes"
    },
    {
        "dni": "9999999S",
        "nomApels": "Remiendos Menta"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/proyecto
>```
### Response: 200
```json
[
    {
        "id": "0000",
        "nombre": "Métodos numéricos",
        "horas": 8
    },
    {
        "id": "0001",
        "nombre": "Métodos Algebraicos",
        "horas": 10
    },
    {
        "id": "0020",
        "nombre": "Motor Wanker",
        "horas": 250
    },
    {
        "id": "005Y",
        "nombre": "Motores de combustión híbrida",
        "horas": 40
    },
    {
        "id": "03R0",
        "nombre": "Radioactividad en portales",
        "horas": 4
    },
    {
        "id": "0400",
        "nombre": "Las posibilidades de Rust en industria aeroespacial",
        "horas": 8
    },
    {
        "id": "6000",
        "nombre": "Explosivos de tierra",
        "horas": 8
    },
    {
        "id": "8000",
        "nombre": "La lluvia de ácido",
        "horas": 8
    },
    {
        "id": "9000",
        "nombre": "La lluvia de oro",
        "horas": 8
    },
    {
        "id": "RY00",
        "nombre": "Motores de combustión externa",
        "horas": 80
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/asignado_a
>```
### Response: 200
```json
[
    {
        "id": 1,
        "cientifico": {
            "dni": "0000000S",
            "nomApels": "Gordon Freeman"
        },
        "proyecto": {
            "id": "03R0",
            "nombre": "Radioactividad en portales",
            "horas": 4
        }
    },
    {
        "id": 2,
        "cientifico": {
            "dni": "1111111S",
            "nomApels": "Michael Newman"
        },
        "proyecto": {
            "id": "0000",
            "nombre": "Métodos numéricos",
            "horas": 8
        }
    },
    {
        "id": 3,
        "cientifico": {
            "dni": "2222222S",
            "nomApels": "Rogrigo García"
        },
        "proyecto": {
            "id": "8000",
            "nombre": "La lluvia de ácido",
            "horas": 8
        }
    },
    {
        "id": 4,
        "cientifico": {
            "dni": "3333333S",
            "nomApels": "Redbull Daalas"
        },
        "proyecto": {
            "id": "005Y",
            "nombre": "Motores de combustión híbrida",
            "horas": 40
        }
    },
    {
        "id": 5,
        "cientifico": {
            "dni": "4444444S",
            "nomApels": "Maravillas Martínez"
        },
        "proyecto": {
            "id": "9000",
            "nombre": "La lluvia de oro",
            "horas": 8
        }
    },
    {
        "id": 6,
        "cientifico": {
            "dni": "5555555S",
            "nomApels": "Núria Style"
        },
        "proyecto": {
            "id": "0001",
            "nombre": "Métodos Algebraicos",
            "horas": 10
        }
    },
    {
        "id": 7,
        "cientifico": {
            "dni": "6666666S",
            "nomApels": "Arrebato Liendre"
        },
        "proyecto": {
            "id": "6000",
            "nombre": "Explosivos de tierra",
            "horas": 8
        }
    },
    {
        "id": 8,
        "cientifico": {
            "dni": "7777777S",
            "nomApels": "Xavier Cassanyes"
        },
        "proyecto": {
            "id": "0400",
            "nombre": "Las posibilidades de Rust en industria aeroespacial",
            "horas": 8
        }
    },
    {
        "id": 9,
        "cientifico": {
            "dni": "8888888S",
            "nomApels": "Razones Grandes"
        },
        "proyecto": {
            "id": "RY00",
            "nombre": "Motores de combustión externa",
            "horas": 80
        }
    },
    {
        "id": 10,
        "cientifico": {
            "dni": "9999999S",
            "nomApels": "Remiendos Menta"
        },
        "proyecto": {
            "id": "0020",
            "nombre": "Motor Wanker",
            "horas": 250
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Ejercicio3 


## End-point: LOGIN
### Method: POST
>```
>http://localhost:8181/api/auth/signin
>```
### Body (**raw**)

```json
{
    "username": "Palmira",
    "password": "pass"
}
```

### Response: 200
```json
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQYWxtaXJhIiwiaWF0IjoxNjgyOTg2NDg1LCJleHAiOjE2ODMwNzI4ODV9.tXIyisOFCkEhSzfJvZn1QvlgLRiU6mSjyxtzhl-sjSPuzr8oIgeL17U1eqo-pTpLj0GzejNHERn_VaeibvlPIA",
    "type": "Bearer",
    "username": "Palmira"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE USER
### Method: POST
>```
>http://localhost:8181/api/auth/signup
>```
### Body (**raw**)

```json
{
    "username": "Palmira",
    "password": "pass"
}
```

### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>localhost:8181/api/cajeros
>```
### Response: 200
```json
[
    {
        "codigo": 1,
        "nomApels": "Arya Stark"
    },
    {
        "codigo": 2,
        "nomApels": "Tyrion Lannister"
    },
    {
        "codigo": 3,
        "nomApels": "Jon Snow"
    },
    {
        "codigo": 4,
        "nomApels": "Bran Stark"
    },
    {
        "codigo": 5,
        "nomApels": "Rob Stark"
    },
    {
        "codigo": 6,
        "nomApels": "Cersei Lannister"
    },
    {
        "codigo": 7,
        "nomApels": "Daenerys Targaryen"
    },
    {
        "codigo": 8,
        "nomApels": "Jaime Lannister"
    },
    {
        "codigo": 9,
        "nomApels": "Theon Greyjoy"
    },
    {
        "codigo": 10,
        "nomApels": "Brienne de Tarth"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/maquinas_registradoras
>```
### Response: 200
```json
[
    {
        "codigo": 1,
        "piso": 1
    },
    {
        "codigo": 2,
        "piso": 2
    },
    {
        "codigo": 3,
        "piso": 3
    },
    {
        "codigo": 4,
        "piso": 4
    },
    {
        "codigo": 5,
        "piso": 5
    },
    {
        "codigo": 6,
        "piso": 6
    },
    {
        "codigo": 7,
        "piso": 7
    },
    {
        "codigo": 8,
        "piso": 8
    },
    {
        "codigo": 9,
        "piso": 9
    },
    {
        "codigo": 10,
        "piso": 10
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/productos
>```
### Response: 200
```json
[
    {
        "codigo": 1,
        "nombre": "Manzanas",
        "precio": 5
    },
    {
        "codigo": 2,
        "nombre": "Peras",
        "precio": 3
    },
    {
        "codigo": 3,
        "nombre": "Pimientos",
        "precio": 3
    },
    {
        "codigo": 4,
        "nombre": "Pizza",
        "precio": 10
    },
    {
        "codigo": 5,
        "nombre": "Pan",
        "precio": 2
    },
    {
        "codigo": 6,
        "nombre": "Croquetas",
        "precio": 12
    },
    {
        "codigo": 7,
        "nombre": "Macarrones con queso",
        "precio": 15
    },
    {
        "codigo": 8,
        "nombre": "Patatas",
        "precio": 8
    },
    {
        "codigo": 9,
        "nombre": "Chorizo",
        "precio": 4
    },
    {
        "codigo": 10,
        "nombre": "Lomo",
        "precio": 7
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/venta
>```
### Response: 200
```json
[
    {
        "id": 1,
        "cajero": {
            "codigo": 1,
            "nomApels": "Arya Stark"
        },
        "producto": {
            "codigo": 1,
            "nombre": "Manzanas",
            "precio": 5
        },
        "maquina": {
            "codigo": 1,
            "piso": 1
        }
    },
    {
        "id": 2,
        "cajero": {
            "codigo": 2,
            "nomApels": "Tyrion Lannister"
        },
        "producto": {
            "codigo": 2,
            "nombre": "Peras",
            "precio": 3
        },
        "maquina": {
            "codigo": 2,
            "piso": 2
        }
    },
    {
        "id": 3,
        "cajero": {
            "codigo": 3,
            "nomApels": "Jon Snow"
        },
        "producto": {
            "codigo": 3,
            "nombre": "Pimientos",
            "precio": 3
        },
        "maquina": {
            "codigo": 3,
            "piso": 3
        }
    },
    {
        "id": 4,
        "cajero": {
            "codigo": 4,
            "nomApels": "Bran Stark"
        },
        "producto": {
            "codigo": 4,
            "nombre": "Pizza",
            "precio": 10
        },
        "maquina": {
            "codigo": 4,
            "piso": 4
        }
    },
    {
        "id": 5,
        "cajero": {
            "codigo": 5,
            "nomApels": "Rob Stark"
        },
        "producto": {
            "codigo": 5,
            "nombre": "Pan",
            "precio": 2
        },
        "maquina": {
            "codigo": 5,
            "piso": 5
        }
    },
    {
        "id": 6,
        "cajero": {
            "codigo": 6,
            "nomApels": "Cersei Lannister"
        },
        "producto": {
            "codigo": 6,
            "nombre": "Croquetas",
            "precio": 12
        },
        "maquina": {
            "codigo": 6,
            "piso": 6
        }
    },
    {
        "id": 7,
        "cajero": {
            "codigo": 7,
            "nomApels": "Daenerys Targaryen"
        },
        "producto": {
            "codigo": 7,
            "nombre": "Macarrones con queso",
            "precio": 15
        },
        "maquina": {
            "codigo": 7,
            "piso": 7
        }
    },
    {
        "id": 8,
        "cajero": {
            "codigo": 8,
            "nomApels": "Jaime Lannister"
        },
        "producto": {
            "codigo": 8,
            "nombre": "Patatas",
            "precio": 8
        },
        "maquina": {
            "codigo": 8,
            "piso": 8
        }
    },
    {
        "id": 9,
        "cajero": {
            "codigo": 9,
            "nomApels": "Theon Greyjoy"
        },
        "producto": {
            "codigo": 9,
            "nombre": "Chorizo",
            "precio": 4
        },
        "maquina": {
            "codigo": 9,
            "piso": 9
        }
    },
    {
        "id": 10,
        "cajero": {
            "codigo": 10,
            "nomApels": "Brienne de Tarth"
        },
        "producto": {
            "codigo": 10,
            "nombre": "Lomo",
            "precio": 7
        },
        "maquina": {
            "codigo": 10,
            "piso": 10
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
# 📁 Collection: Ejercicio4 


## End-point: LOGIN
### Method: GET
>```
>undefined
>```

⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: CREATE USER
### Method: POST
>```
>http://localhost:8181/api/auth/signup
>```
### Body (**raw**)

```json
{
    "username": "Palmira",
    "password": "pass"
}
```

### Response: 200
```json
Without body
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/facultad
>```
### Response: 200
```json
[
    {
        "codigo": 1,
        "nombre": "Fisica"
    },
    {
        "codigo": 2,
        "nombre": "Matemáticas"
    },
    {
        "codigo": 3,
        "nombre": "Química"
    },
    {
        "codigo": 4,
        "nombre": "Psicología"
    },
    {
        "codigo": 5,
        "nombre": "Derecho"
    },
    {
        "codigo": 6,
        "nombre": "Biología"
    },
    {
        "codigo": 7,
        "nombre": "Ingenieria Forestal"
    },
    {
        "codigo": 8,
        "nombre": "Economía"
    },
    {
        "codigo": 9,
        "nombre": "Ingeniería Informática"
    },
    {
        "codigo": 10,
        "nombre": "Turismo"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/equipos
>```
### Response: 200
```json
[
    {
        "numSerie": "AA",
        "nombre": "Equipo1",
        "facultad": {
            "codigo": 1,
            "nombre": "Fisica"
        }
    },
    {
        "numSerie": "BB",
        "nombre": "Equipo2",
        "facultad": {
            "codigo": 2,
            "nombre": "Matemáticas"
        }
    },
    {
        "numSerie": "CC",
        "nombre": "Equipo3",
        "facultad": {
            "codigo": 3,
            "nombre": "Química"
        }
    },
    {
        "numSerie": "DD",
        "nombre": "Equipo4",
        "facultad": {
            "codigo": 4,
            "nombre": "Psicología"
        }
    },
    {
        "numSerie": "EE",
        "nombre": "Equipo5",
        "facultad": {
            "codigo": 5,
            "nombre": "Derecho"
        }
    },
    {
        "numSerie": "FF",
        "nombre": "Equipo6",
        "facultad": {
            "codigo": 6,
            "nombre": "Biología"
        }
    },
    {
        "numSerie": "GG",
        "nombre": "Equipo7",
        "facultad": {
            "codigo": 7,
            "nombre": "Ingenieria Forestal"
        }
    },
    {
        "numSerie": "LL",
        "nombre": "Equipo8",
        "facultad": {
            "codigo": 8,
            "nombre": "Economía"
        }
    },
    {
        "numSerie": "MM",
        "nombre": "Equipo9",
        "facultad": {
            "codigo": 9,
            "nombre": "Ingeniería Informática"
        }
    },
    {
        "numSerie": "NN",
        "nombre": "Equipo10",
        "facultad": {
            "codigo": 10,
            "nombre": "Turismo"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GEL_ALL
### Method: GET
>```
>http://localhost:8181/api/investigadores
>```
### Response: 200
```json
[
    {
        "dni": "1278997C",
        "nomApels": "Dwight Schrute",
        "facultad": {
            "codigo": 7,
            "nombre": "Ingenieria Forestal"
        }
    },
    {
        "dni": "1456897D",
        "nomApels": "Angela Martin",
        "facultad": {
            "codigo": 3,
            "nombre": "Química"
        }
    },
    {
        "dni": "1458789A",
        "nomApels": "Kevin Malone",
        "facultad": {
            "codigo": 2,
            "nombre": "Matemáticas"
        }
    },
    {
        "dni": "2557888E",
        "nomApels": "Jim Halpert",
        "facultad": {
            "codigo": 1,
            "nombre": "Fisica"
        }
    },
    {
        "dni": "4459898D",
        "nomApels": "Pamela Beesly",
        "facultad": {
            "codigo": 10,
            "nombre": "Turismo"
        }
    },
    {
        "dni": "4555996C",
        "nomApels": "Kelly Kapoor",
        "facultad": {
            "codigo": 10,
            "nombre": "Turismo"
        }
    },
    {
        "dni": "4557878B",
        "nomApels": "Michael Scott",
        "facultad": {
            "codigo": 4,
            "nombre": "Psicología"
        }
    },
    {
        "dni": "4778863R",
        "nomApels": "Ryan Howard",
        "facultad": {
            "codigo": 5,
            "nombre": "Derecho"
        }
    },
    {
        "dni": "4798863E",
        "nomApels": "Phyllis Vance",
        "facultad": {
            "codigo": 6,
            "nombre": "Biología"
        }
    },
    {
        "dni": "7889882T",
        "nomApels": "Toby Flenderson",
        "facultad": {
            "codigo": 9,
            "nombre": "Ingeniería Informática"
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: GET_ALL
### Method: GET
>```
>http://localhost:8181/api/reserva
>```
### Response: 200
```json
[
    {
        "id": 1,
        "comienzo": "2020-03-14T23:00:00.000+00:00",
        "fin": "2021-02-28T23:00:00.000+00:00",
        "investigador": {
            "dni": "4557878B",
            "nomApels": "Michael Scott",
            "facultad": {
                "codigo": 4,
                "nombre": "Psicología"
            }
        },
        "equipo": {
            "numSerie": "AA",
            "nombre": "Equipo1",
            "facultad": {
                "codigo": 1,
                "nombre": "Fisica"
            }
        }
    },
    {
        "id": 2,
        "comienzo": "2021-03-14T23:00:00.000+00:00",
        "fin": "2021-03-31T22:00:00.000+00:00",
        "investigador": {
            "dni": "1278997C",
            "nomApels": "Dwight Schrute",
            "facultad": {
                "codigo": 7,
                "nombre": "Ingenieria Forestal"
            }
        },
        "equipo": {
            "numSerie": "BB",
            "nombre": "Equipo2",
            "facultad": {
                "codigo": 2,
                "nombre": "Matemáticas"
            }
        }
    },
    {
        "id": 3,
        "comienzo": "2022-05-01T22:00:00.000+00:00",
        "fin": "2023-02-27T23:00:00.000+00:00",
        "investigador": {
            "dni": "4459898D",
            "nomApels": "Pamela Beesly",
            "facultad": {
                "codigo": 10,
                "nombre": "Turismo"
            }
        },
        "equipo": {
            "numSerie": "DD",
            "nombre": "Equipo4",
            "facultad": {
                "codigo": 4,
                "nombre": "Psicología"
            }
        }
    },
    {
        "id": 4,
        "comienzo": "2019-11-30T23:00:00.000+00:00",
        "fin": "2020-07-09T22:00:00.000+00:00",
        "investigador": {
            "dni": "4798863E",
            "nomApels": "Phyllis Vance",
            "facultad": {
                "codigo": 6,
                "nombre": "Biología"
            }
        },
        "equipo": {
            "numSerie": "MM",
            "nombre": "Equipo9",
            "facultad": {
                "codigo": 9,
                "nombre": "Ingeniería Informática"
            }
        }
    },
    {
        "id": 5,
        "comienzo": "2020-03-14T23:00:00.000+00:00",
        "fin": "2020-04-29T22:00:00.000+00:00",
        "investigador": {
            "dni": "4778863R",
            "nomApels": "Ryan Howard",
            "facultad": {
                "codigo": 5,
                "nombre": "Derecho"
            }
        },
        "equipo": {
            "numSerie": "AA",
            "nombre": "Equipo1",
            "facultad": {
                "codigo": 1,
                "nombre": "Fisica"
            }
        }
    },
    {
        "id": 6,
        "comienzo": "2005-08-21T22:00:00.000+00:00",
        "fin": "2005-11-30T23:00:00.000+00:00",
        "investigador": {
            "dni": "1458789A",
            "nomApels": "Kevin Malone",
            "facultad": {
                "codigo": 2,
                "nombre": "Matemáticas"
            }
        },
        "equipo": {
            "numSerie": "CC",
            "nombre": "Equipo3",
            "facultad": {
                "codigo": 3,
                "nombre": "Química"
            }
        }
    },
    {
        "id": 7,
        "comienzo": "2022-05-01T22:00:00.000+00:00",
        "fin": "2023-02-27T23:00:00.000+00:00",
        "investigador": {
            "dni": "2557888E",
            "nomApels": "Jim Halpert",
            "facultad": {
                "codigo": 1,
                "nombre": "Fisica"
            }
        },
        "equipo": {
            "numSerie": "DD",
            "nombre": "Equipo4",
            "facultad": {
                "codigo": 4,
                "nombre": "Psicología"
            }
        }
    },
    {
        "id": 8,
        "comienzo": "2019-04-09T22:00:00.000+00:00",
        "fin": "2021-02-28T23:00:00.000+00:00",
        "investigador": {
            "dni": "4555996C",
            "nomApels": "Kelly Kapoor",
            "facultad": {
                "codigo": 10,
                "nombre": "Turismo"
            }
        },
        "equipo": {
            "numSerie": "NN",
            "nombre": "Equipo10",
            "facultad": {
                "codigo": 10,
                "nombre": "Turismo"
            }
        }
    },
    {
        "id": 9,
        "comienzo": "2019-12-31T23:00:00.000+00:00",
        "fin": "2023-02-28T23:00:00.000+00:00",
        "investigador": {
            "dni": "7889882T",
            "nomApels": "Toby Flenderson",
            "facultad": {
                "codigo": 9,
                "nombre": "Ingeniería Informática"
            }
        },
        "equipo": {
            "numSerie": "LL",
            "nombre": "Equipo8",
            "facultad": {
                "codigo": 8,
                "nombre": "Economía"
            }
        }
    },
    {
        "id": 10,
        "comienzo": "2018-11-09T23:00:00.000+00:00",
        "fin": "2021-04-30T22:00:00.000+00:00",
        "investigador": {
            "dni": "1456897D",
            "nomApels": "Angela Martin",
            "facultad": {
                "codigo": 3,
                "nombre": "Química"
            }
        },
        "equipo": {
            "numSerie": "GG",
            "nombre": "Equipo7",
            "facultad": {
                "codigo": 7,
                "nombre": "Ingenieria Forestal"
            }
        }
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

