# ToDoList

## Introduction

Application for managing tasks in todo list.

## Library used

* SpringBoot

## Getting Started

After installing Java jdk run Class ```ToDoListApplication```

## File structure

```cmd
C:.
│   ToDoListApplication.java
│
├───Controller
│       TaskController.java
│
├───Model
│       Task.java
│
├───Service
│       TaskService.java
│
└───Utilities
        DateValidation.java
```

## Api and Routes

> GET `/task/{id}`

* Request Argument: id.
* Response: Task by id.

Response Example:

```json
{
  "title": "t3",
  "description": "d3",
  "dueDate": "2023-12-14",
  "status": "open",
  "id": 3
}
```

> GET `/tasks`

* Request Argument: none.
* Response: all tasks.

Response Example:

```json
[
  {
    "title": "t1",
    "description": "d1",
    "dueDate": "2023-12-12",
    "status": "open",
    "id": 1
  },
  {
    "title": "t2",
    "description": "d2",
    "dueDate": "2023-12-13",
    "status": "closed",
    "id": 2
  },
  {
    "title": "t3",
    "description": "d3",
    "dueDate": "2023-12-14",
    "status": "open",
    "id": 3
  }
]
```
> POST `/task`

* Request Argument: none.
* Response: all tasks.

Resquest Example:

```json
{
  "title": "t5",
  "description": "d5",
  "status": "open",
  "dueDate":"2023-12-12"

}
```
Response Example:

```json
"Created successfully"
```