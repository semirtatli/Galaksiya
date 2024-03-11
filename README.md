# Galaksiya Intern Project

---

## Description

---

## Technologies

---

- Java
- Spring Boot
- Maven
- PostgreSQL
- JDBC
- Junit
- Mockito

## Installation

---

1. [Clone Repository Link](https://github.com/ilknuruysal/staj2023backend.git)

2. Maven ile dependency'leri indir

3. Postgre Serverini kurup application.properties'ten konfigurasyonunu yap

## Setup

1. `src/main/resources/application.properties` icindeki database'i kur

2. Projeyi calistir

Proje `http://localhost:8080` uzerinde calısır.

## API Endpoints

---

### REQUESTS

**Request**

- #### POST /api/1.0/users

  _Yeni bir kullanici olusturur_

```
  {
    "username": "username",
    "displayName": "displayName",
    "password": "P4ssword"
}

```

**Response**

```
{
    "message": "user created"
}
```

**Request**

- #### GET /api/1.0/users

  _Tum kullanicilari listeler_

**Response**

```
   [
    {
        "id": 1,
        "username": "admin",
        "displayName": "admin",
        "password": "$2a$10$A6t4weBxcGMBe7Wl1aNttOi/z3GpuxhVNK9trgJF6Zd8xod2TVYmG"
    },

    {
        "id": 2,
        "username": "username",
        "displayName": "username",
        "password": "$2a$10$4ffg1s3CorG8Pyku01jhdO33/OXcXfogCOvA0zbhw/fergaMAqp82"
    },

    {
        "id": 52,
        "username": "username8",
        "displayName": "displayName",
        "password": "$2a$10$oEgG1J.xTlj1dX2vA9Bk6eyispIu4l1Ve2sekTvSFPNkYtREeGq0G"
    }
]
```

**Request**

- #### GET getUserById - /api/1.0/users/{id}

  _Id ile spesifik bir kullaniciyi listeler_

`/api/1.0/users/1`

**Response**

```
{
    "id": 1,
    "username": "admin",
    "displayName": "admin",
    "password": "$2a$10$A6t4weBxcGMBe7Wl1aNttOi/z3GpuxhVNK9trgJF6Zd8xod2TVYmG"
}
```

**Request**

- #### PATCH updateUserById - /api/1.0/users/{id}

  _Bir kullaniciyi gunceller_

`/api/1.0/users/52`

```
  {
    "username": "username9",
    "displayName": "displayName",
    "password": "P4ssword"
}
```

**Response**

```
{
    "id": 52,
    "username": "username9",
    "displayName": "displayName",
    "password": "$2a$10$EZhGmGL7aU.3J8/92rEJW.sPXPZwUmG3ubUw3NsHowGcshiOYHyqO"
}
```

**Request**

- #### DELETE deleteUserById - /api/1.0/users/{id}

  _Bir kullaniciyi siler_

`/api/1.0/users/52`

**Response**

` `

**Request**

- #### POST createCategory - /api/category

  _Bir kategori olusturur_

```
{
    "categoryName": "Tablet"

}
```

**Response**

```
{
    "id": "6ff7566f-a004-40c1-93aa-17690d7b5810"
}
```

**Request**

- #### GET getAllCategories - /api/category

  _Tum kategorileri listeler_

**Response**

```
[
    {
        "id": 1,
        "categoryName": "Laptop"
    },
    {
        "id": 3,
        "categoryName": "Telefon"
    },
    {
        "id": 52,
        "categoryName": "Tablet"
    }
]
```

**Request**

- #### DELETE deleteCategoryById - /api/category/{id}

  _Bir kategoriyi siler_

`/api/category/52`

**Response**

` `

**Request**

- #### POST createProduct - /api/products

  _Bir urun olusturur_

```
{
    "productName": "LaptopUrunu",
    "productPrice": 42.500,
    "productCategoryID": 1,
    "productColor": "Gri",
    "productStock": 25
}
```

**Response**

```
{
    "id": "12339385-a6a0-49a4-931b-19c9a3bb27e1"
}
```

**Request**

- #### GET getAllProducts - /api/products

  _Tum urunleri listeler_

**Response**

```
[
    {
        "id": 1,
        "productName": "IyiLaptop",
        "productCategoryID": 1,
        "productPrice": 21065.00,
        "productColor": "Kırmızı",
        "productStock": 118
    },
    {
        "id": 2,
        "productName": "efsaneharikalaptop",
        "productCategoryID": 3,
        "productPrice": 860.90,
        "productColor": "Bemmbeyaz",
        "productStock": 1
    },
    {
        "id": 52,
        "productName": "LaptopUrunu",
        "productCategoryID": 1,
        "productPrice": 42.50,
        "productColor": "Gri",
        "productStock": 25
    }
]
```

**Request**

- #### GET getProductByCategory - /api/products/byCategory/{ProductCategoryID}

  _Urunleri kategoriye gore filtreleyerek listeler_

`/api/products/byCategory/1`

**Response**

```
[
    {
        "id": 1,
        "productName": "IyiLaptop",
        "productCategoryID": 1,
        "productPrice": 21065.00,
        "productColor": "Kırmızı",
        "productStock": 118
    },
    {
        "id": 52,
        "productName": "LaptopUrunu",
        "productCategoryID": 1,
        "productPrice": 42.50,
        "productColor": "Gri",
        "productStock": 25
    }
]
```

**Request**

- #### GET getProductById - /api/products/{id}"

  _Bir urunu listeler_

`/api/products/52`

**Response**

```
{
    "id": 52,
    "productName": "LaptopUrunu",
    "productCategoryID": 1,
    "productPrice": 42.50,
    "productColor": "Gri",
    "productStock": 25
}
```

**Request**

- #### PUT updateProductById - /api/products/{id}

  _Bir urunu gunceller_

`/api/products/52`

```
{
    "productName": "LaptopUrunu",
    "productPrice": 45.000,
    "productCategoryID": 1,
    "productColor": "Beyaz",
    "productStock": 40
}
```

**Response**

```
{
    "id": 52,
    "productName": "LaptopUrunu",
    "productCategoryID": 1,
    "productPrice": 45.000,
    "productColor": "Beyaz",
    "productStock": 40
}
```

**Request**

- #### DELETE deleteProductByID - /api/products/{id}

  _Bir urunu siler_

`/api/products/52`

**Response**

` `

**Request**

- #### POST createOrder - /api/orders

  _Bir siparis olusturur_

```
  {
  "soldProducts": [
    {
      "product": {
        "id": 1
      },
      "numberOfProduct": 18
    },
    {
      "product": {
        "id": 52
      },
      "numberOfProduct": 20
    }
  ]
}
```

**Response**

```
{
        "id": 1,
            "soldProducts": [
        {
            "id": null,
                "product": {
            "id": 1,
                    "productName": null,
                    "productCategoryID": null,
                    "productPrice": null,
                    "productColor": null,
                    "productStock": null
        },
            "numberOfProduct": 18,
                "selling": null
        },
        {
            "id": null,
                "product": {
            "id": 52,
                    "productName": null,
                    "productCategoryID": null,
                    "productPrice": null,
                    "productColor": null,
                    "productStock": null
        },
            "numberOfProduct": 20,
                "selling": null
        }
    ]
    }
```

**Request**

- #### GET getAllSelling - /api/orders

  _Tum siparisleri listeler_

**Response**

```
[
    {
        "id": 1,
        "soldProducts": []
    }
]
```
