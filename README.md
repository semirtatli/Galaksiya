# Galaksiya Intern Project

---

## Installation

---

1. [Clone Repository Link](https://github.com/semirtatli/Galaksiya.git)

2. Download dependency with Maven

3. Setup Postgre Server and configure with application.properties

## Setup

1. Setup database inside `src/main/resources/application.properties`

2. Executt

Project runs on `http://localhost:8080`

## API Endpoints

---

### REQUESTS

**Request**

- #### POST /api/1.0/users

  _Create new user_

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

  _List all users_

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

  _List a user with id_

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

  _Update a user_

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

  _Delete a user_

`/api/1.0/users/52`

**Response**

` `

**Request**

- #### POST createCategory - /api/category

  _Create a category_

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

  _List all categories_

**Response**

```
[
    {
        "id": 1,
        "categoryName": "Laptop"
    },
    {
        "id": 3,
        "categoryName": "Phone"
    },
    {
        "id": 52,
        "categoryName": "Tablet"
    }
]
```

**Request**

- #### DELETE deleteCategoryById - /api/category/{id}

  _Deletes a category_

`/api/category/52`

**Response**

` `

**Request**

- #### POST createProduct - /api/products

  _Creates a produst_

```
{
    "productName": "LaptopProduct",
    "productPrice": 42.500,
    "productCategoryID": 1,
    "productColor": "Grey",
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

  _Lists all products_

**Response**

```
[
    {
        "id": 1,
        "productName": "GoodLaptop",
        "productCategoryID": 1,
        "productPrice": 21065.00,
        "productColor": "Red",
        "productStock": 118
    },
    {
        "id": 2,
        "productName": "VeryGoodlaptop",
        "productCategoryID": 3,
        "productPrice": 860.90,
        "productColor": "White",
        "productStock": 1
    },
    {
        "id": 52,
        "productName": "LaptopProduct",
        "productCategoryID": 1,
        "productPrice": 42.50,
        "productColor": "Grey",
        "productStock": 25
    }
]
```

**Request**

- #### GET getProductByCategory - /api/products/byCategory/{ProductCategoryID}

  _Filter products by category and list_

`/api/products/byCategory/1`

**Response**

```
[
    {
        "id": 1,
        "productName": "GoodLaptop",
        "productCategoryID": 1,
        "productPrice": 21065.00,
        "productColor": "Red",
        "productStock": 118
    },
    {
        "id": 52,
        "productName": "LaptopProduct",
        "productCategoryID": 1,
        "productPrice": 42.50,
        "productColor": "Grey",
        "productStock": 25
    }
]
```

**Request**

- #### GET getProductById - /api/products/{id}"

  _List a product_

`/api/products/52`

**Response**

```
{
    "id": 52,
    "productName": "LaptopProduct",
    "productCategoryID": 1,
    "productPrice": 42.50,
    "productColor": "Grey",
    "productStock": 25
}
```

**Request**

- #### PUT updateProductById - /api/products/{id}

  _Update a product_

`/api/products/52`

```
{
    "productName": "LaptopProduct",
    "productPrice": 45.000,
    "productCategoryID": 1,
    "productColor": "White",
    "productStock": 40
}
```

**Response**

```
{
    "id": 52,
    "productName": "LaptopProduct",
    "productCategoryID": 1,
    "productPrice": 45.000,
    "productColor": "White",
    "productStock": 40
}
```

**Request**

- #### DELETE deleteProductByID - /api/products/{id}

  _Lists a product_

`/api/products/52`

**Response**

` `

**Request**

- #### POST createOrder - /api/orders

  _Creates a product_

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

  _Lists all orders_

**Response**

```
[
    {
        "id": 1,
        "soldProducts": []
    }
]
```
