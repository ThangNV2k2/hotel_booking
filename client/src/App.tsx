import { ReloadIcon } from '@radix-ui/react-icons'
import { Button } from './components/ui/button'

function App() {

  return (
    <>
      <Button>Click me</Button>
      <Button disabled>
        <ReloadIcon className="mr-2 h-4 w-4 animate-spin" />
        Please wait
      </Button>
    </>
  )
}

export default App
