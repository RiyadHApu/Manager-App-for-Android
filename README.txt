DESKBOOK MANAGER - CLOUD VERSION (phone + tablet share one company database)

PART A. Create your free company cloud (Firebase), once, about 10 minutes
 1. Go to console.firebase.google.com, sign in with a Google account, click "Create a project".
    Name it, turn Google Analytics OFF, create.
 2. Left menu: Build > Authentication > Get started > Email/Password > Enable > Save.
    Then the "Users" tab > Add user. Create one email + password for each person who will use the app.
 3. Left menu: Build > Firestore Database > Create database. Pick the location closest to you
    (it cannot be changed later), choose "Production mode", Create.
 4. In Firestore, open the "Rules" tab. Delete everything, paste the contents of firestore.rules
    (put the real email addresses from step 2 in the list), click Publish.
 5. Click the gear icon > Project settings > General > scroll to "Your apps" > click the web icon </>.
    Give it any name, Register app. Copy the firebaseConfig block that appears.

PART B. Build and install the app (same as before)
 6. Upload this folder to your GitHub repository (it replaces the old files), wait for the green tick
    in the Actions tab, download the DeskbookManager-apk file, unzip and install app-debug.apk.
    Install the same file on the phone and the tablet.
    If Android refuses to install over the old version, uninstall the old Deskbook Manager first.
 7. Open the app, paste the firebaseConfig block, tap Connect, then sign in.
    Do the same on the other device. Both now show the same live data.
