import './ProjectContainer.css'

const ProjectContainer = ({ project }) => (
  <div className='project'>
    <img src={project.imageUrl} alt='' className='project__image' />
    <div className='project__name-description'>
      <h3>{project.name}</h3>
      <p className='project__description'>{project.description}</p>
      <p className='project__stack-item'>{project.stack}</p>
    </div>
  </div>
)

export default ProjectContainer
