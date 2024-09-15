<<<<<<< HEAD
import "./App.scss";
import { Button } from "@/components/ui/button";

function App() {
  return <Button>Hello</Button>;
}

export default App;
=======
import { Button } from "@/components/ui/button"
import { Checkbox } from "@/components/ui/checkbox"
import { ReloadIcon } from "@radix-ui/react-icons"

function App() {
  return (
    <>
      <p className="text-red-300">hello</p>
      <Button>Click me</Button>
      <Checkbox />
      <Button disabled>
        <ReloadIcon className="mr-2 h-4 w-4 animate-spin" />
        Please wait
      </Button>
      <div className="bg-success h-4 w-full"></div>
    </>
  )
}

export default App
>>>>>>> 276a2f89898cecbffff6c146f86995e4d90eb624
