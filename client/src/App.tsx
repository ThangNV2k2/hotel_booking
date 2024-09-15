import { ReloadIcon } from '@radix-ui/react-icons'
import { Button } from './components/ui/button'
import {Input} from "./components/ui/input.tsx";


function App() {

  return (
    <>
      <Button>Click me</Button>
      <Button disabled>
        <ReloadIcon className="mr-2 h-4 w-4 animate-spin" />
        Please wait
      </Button>
        <Input placeholder="Email" type="email" />
    </>
  )
}

export default App
