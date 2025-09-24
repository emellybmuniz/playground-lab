import type { ReactNode } from "react";

interface Props {
  children: ReactNode;
  color: 'primary' | 'secondary' | 'sucess';
  onClick: () => void;
}

const Button = ({ children, onClick, color = "primary" }: Props) => {
  return (
    <button type='button' className={'btn btn-'+color} onClick={onClick}>
        {children}
    </button>
  )
}
export default Button