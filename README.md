📦 File Packer & Unpacker (Java)

A simple Java-based project that allows you to **pack multiple text files into a single file** with basic encryption and later **unpack (extract) them back** to original files.

---

🚀 Features

* 📁 Pack multiple `.txt` files from a folder into one file
* 🔐 Basic encryption using XOR logic
* 📤 Extract (unpack) files with original names and content
* ⚡ Fast file processing using byte streams
* 🧠 Simple and easy-to-understand logic

---

🛠️ Technologies Used

* Java
* File Handling (FileInputStream / FileOutputStream)
* Byte-level operations
* XOR Encryption

---
📂 How It Works

🔹 Packing Process

1. User enters folder name
2. Program reads all `.txt` files
3. Creates a **header** (filename + size)
4. Encrypts file data using XOR
5. Writes header + encrypted data into one packed file

---

🔹 Unpacking Process

1. User provides packed file
2. Program reads header information
3. Extracts filename and size
4. Decrypts data using XOR
5. Recreates original files

---

▶️ How to Run

1. Compile the Programs

```bash
javac program606.java
javac program614.java
```

---

2. Run Packing Program

```bash
java program606
```

👉 Enter:

* Folder name
* Output packed file name

---
 3. Run Unpacking Program

```bash
java program614
```

👉 Enter:

* Packed file name

---

 📌 Example

```
Input Folder:
- file1.txt
- file2.txt

Output:
- packed.dat
```

After unpacking:

```
- file1.txt
- file2.txt
```

---

🔐 Encryption Logic

This project uses a simple XOR encryption:

```java
Buffer[i] = (byte)(Buffer[i] ^ 0x11);
```

✔ Same logic is used for encryption & decryption

---

⚠️ Limitations

* Only supports `.txt` files
* Basic encryption (not secure for real-world use)
* No GUI (console-based project)

---

 💡 Future Improvements

* Add support for all file types
* Implement strong encryption (AES)
* Create GUI using Swing / JavaFX
* Add compression to reduce file size

---

👨‍💻 Author

**Vaibhav Datkhil**
BTech IT Student
