# java_springboot_crud_mysql
Crud Restfull API menggunakan Java Springboot

# refresh dependency
gradlew --refresh-dependency
# run
gradlew bootRun

# list semua student
GET http://localhost:8080/api/students
# input student baru
POST http://localhost:8080/api/students
# pilih student berdasarkan id
GET http://localhost:8080/api/students/{id}
# update student berdasarkan id
PUT http://localhost:8080/api/students/{id}
# hapus student berdasarkan id
DELETE http://localhost:8080/api/students/{id}

# list semua admin
GET http://localhost:8080/api/admins
# input admin baru
POST http://localhost:8080/api/admins
# pilih admin berdasarkan id
GET http://localhost:8080/api/admins/{id}
# update admin berdasarkan id
PUT http://localhost:8080/api/admins/{id}
# hapus admin berdasarkan id
DELETE http://localhost:8080/api/admins/{id}
