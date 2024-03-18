import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
const Stack = createStackNavigator();

// import Login from "./Login";
// import Home from "./Home";
// import Dashboard from "./Dashboard";

import Register from "./Register";
import Home from "./Home";

export default function App() {

  return (
    <NavigationContainer>
      <Stack.Navigator screenOptions={{ headerShown: true }}>
      <Stack.Screen name="Login" component={Login} />
      <Stack.Screen name="SignUp" component={SignUp} />
      <Stack.Screen name="Register" component={Register} />
      <Stack.Screen name="Home" component={Home} />
      </Stack.Navigator>
    </NavigationContainer>
  );
  import React, { useState } from 'react';
import SignUp from './SignUp';


// const App = () => {
//   const [loggedIn, setLoggedIn] = useState(false);

//   return (
//     <div>
//       {!loggedIn ? (
//         <div>
//           <SignUp setLoggedIn={setLoggedIn} />
//           <Login setLoggedIn={setLoggedIn} />
//         </div>
//       ) : (
//         <h2>Welcome, you are logged in!</h2>
//       )}
//     </div>
//   );
// };

// export default App;

}