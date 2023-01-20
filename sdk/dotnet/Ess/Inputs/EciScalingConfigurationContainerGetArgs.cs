// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess.Inputs
{

    public sealed class EciScalingConfigurationContainerGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("args")]
        private InputList<string>? _args;

        /// <summary>
        /// The arguments passed to the commands.
        /// </summary>
        public InputList<string> Args
        {
            get => _args ?? (_args = new InputList<string>());
            set => _args = value;
        }

        [Input("commands")]
        private InputList<string>? _commands;

        /// <summary>
        /// The commands run by the init container.
        /// </summary>
        public InputList<string> Commands
        {
            get => _commands ?? (_commands = new InputList<string>());
            set => _commands = value;
        }

        /// <summary>
        /// The amount of CPU resources allocated to the container group.
        /// </summary>
        [Input("cpu")]
        public Input<double>? Cpu { get; set; }

        [Input("environmentVars")]
        private InputList<Inputs.EciScalingConfigurationContainerEnvironmentVarGetArgs>? _environmentVars;

        /// <summary>
        /// The structure of environmentVars.
        /// See Block_environment_var_in_init_container below for details.
        /// See Block_environment_var_in_container below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationContainerEnvironmentVarGetArgs> EnvironmentVars
        {
            get => _environmentVars ?? (_environmentVars = new InputList<Inputs.EciScalingConfigurationContainerEnvironmentVarGetArgs>());
            set => _environmentVars = value;
        }

        /// <summary>
        /// The number GPUs.
        /// </summary>
        [Input("gpu")]
        public Input<int>? Gpu { get; set; }

        /// <summary>
        /// The image of the container.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The restart policy of the image.
        /// </summary>
        [Input("imagePullPolicy")]
        public Input<string>? ImagePullPolicy { get; set; }

        [Input("livenessProbeExecCommands")]
        private InputList<string>? _livenessProbeExecCommands;

        /// <summary>
        /// Commands that you want to run in containers when you use the CLI to perform liveness probes.
        /// </summary>
        public InputList<string> LivenessProbeExecCommands
        {
            get => _livenessProbeExecCommands ?? (_livenessProbeExecCommands = new InputList<string>());
            set => _livenessProbeExecCommands = value;
        }

        /// <summary>
        /// The minimum number of consecutive failures for the liveness probe to be considered failed after having been successful. Default value: 3.
        /// </summary>
        [Input("livenessProbeFailureThreshold")]
        public Input<int>? LivenessProbeFailureThreshold { get; set; }

        /// <summary>
        /// The path to which HTTP GET requests are sent when you use HTTP requests to perform liveness probes.
        /// </summary>
        [Input("livenessProbeHttpGetPath")]
        public Input<string>? LivenessProbeHttpGetPath { get; set; }

        /// <summary>
        /// The port to which HTTP GET requests are sent when you use HTTP requests to perform liveness probes.
        /// </summary>
        [Input("livenessProbeHttpGetPort")]
        public Input<int>? LivenessProbeHttpGetPort { get; set; }

        /// <summary>
        /// The protocol type of HTTP GET requests when you use HTTP requests for liveness probes.Valid values:HTTP and HTTPS.
        /// </summary>
        [Input("livenessProbeHttpGetScheme")]
        public Input<string>? LivenessProbeHttpGetScheme { get; set; }

        /// <summary>
        /// The number of seconds after container has started before liveness probes are initiated.
        /// </summary>
        [Input("livenessProbeInitialDelaySeconds")]
        public Input<int>? LivenessProbeInitialDelaySeconds { get; set; }

        /// <summary>
        /// The interval at which the liveness probe is performed. Unit: seconds. Default value: 10. Minimum value: 1.
        /// </summary>
        [Input("livenessProbePeriodSeconds")]
        public Input<int>? LivenessProbePeriodSeconds { get; set; }

        /// <summary>
        /// The minimum number of consecutive successes for the liveness probe to be considered successful after having failed. Default value: 1. Set the value to 1.
        /// </summary>
        [Input("livenessProbeSuccessThreshold")]
        public Input<int>? LivenessProbeSuccessThreshold { get; set; }

        /// <summary>
        /// The port detected by TCP sockets when you use TCP sockets to perform liveness probes.
        /// </summary>
        [Input("livenessProbeTcpSocketPort")]
        public Input<int>? LivenessProbeTcpSocketPort { get; set; }

        /// <summary>
        /// The timeout period for the liveness probe. Unit: seconds. Default value: 1. Minimum value: 1.
        /// </summary>
        [Input("livenessProbeTimeoutSeconds")]
        public Input<int>? LivenessProbeTimeoutSeconds { get; set; }

        /// <summary>
        /// The amount of memory resources allocated to the container group.
        /// </summary>
        [Input("memory")]
        public Input<double>? Memory { get; set; }

        /// <summary>
        /// The name of the volume.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ports")]
        private InputList<Inputs.EciScalingConfigurationContainerPortGetArgs>? _ports;

        /// <summary>
        /// The structure of port. See Block_port_in_init_container below
        /// for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationContainerPortGetArgs> Ports
        {
            get => _ports ?? (_ports = new InputList<Inputs.EciScalingConfigurationContainerPortGetArgs>());
            set => _ports = value;
        }

        [Input("readinessProbeExecCommands")]
        private InputList<string>? _readinessProbeExecCommands;

        /// <summary>
        /// Commands that you want to run in containers when you use the CLI to perform readiness probes.
        /// </summary>
        public InputList<string> ReadinessProbeExecCommands
        {
            get => _readinessProbeExecCommands ?? (_readinessProbeExecCommands = new InputList<string>());
            set => _readinessProbeExecCommands = value;
        }

        /// <summary>
        /// The minimum number of consecutive failures for the readiness probe to be considered failed after having been successful. Default value: 3.
        /// </summary>
        [Input("readinessProbeFailureThreshold")]
        public Input<int>? ReadinessProbeFailureThreshold { get; set; }

        /// <summary>
        /// The path to which HTTP GET requests are sent when you use HTTP requests to perform readiness probes.
        /// </summary>
        [Input("readinessProbeHttpGetPath")]
        public Input<string>? ReadinessProbeHttpGetPath { get; set; }

        /// <summary>
        /// The port to which HTTP GET requests are sent when you use HTTP requests to perform readiness probes.
        /// </summary>
        [Input("readinessProbeHttpGetPort")]
        public Input<int>? ReadinessProbeHttpGetPort { get; set; }

        /// <summary>
        /// The protocol type of HTTP GET requests when you use HTTP requests for readiness probes. Valid values: HTTP and HTTPS.
        /// </summary>
        [Input("readinessProbeHttpGetScheme")]
        public Input<string>? ReadinessProbeHttpGetScheme { get; set; }

        /// <summary>
        /// The number of seconds after container N has started before readiness probes are initiated.
        /// </summary>
        [Input("readinessProbeInitialDelaySeconds")]
        public Input<int>? ReadinessProbeInitialDelaySeconds { get; set; }

        /// <summary>
        /// The interval at which the readiness probe is performed. Unit: seconds. Default value: 10. Minimum value: 1.
        /// </summary>
        [Input("readinessProbePeriodSeconds")]
        public Input<int>? ReadinessProbePeriodSeconds { get; set; }

        /// <summary>
        /// The minimum number of consecutive successes for the readiness probe to be considered successful after having failed. Default value: 1. Set the value to 1.
        /// </summary>
        [Input("readinessProbeSuccessThreshold")]
        public Input<int>? ReadinessProbeSuccessThreshold { get; set; }

        /// <summary>
        /// The port detected by Transmission Control Protocol (TCP) sockets when you use TCP sockets to perform readiness probes.
        /// </summary>
        [Input("readinessProbeTcpSocketPort")]
        public Input<int>? ReadinessProbeTcpSocketPort { get; set; }

        /// <summary>
        /// The timeout period for the readiness probe. Unit: seconds. Default value: 1. Minimum value: 1.
        /// </summary>
        [Input("readinessProbeTimeoutSeconds")]
        public Input<int>? ReadinessProbeTimeoutSeconds { get; set; }

        [Input("volumeMounts")]
        private InputList<Inputs.EciScalingConfigurationContainerVolumeMountGetArgs>? _volumeMounts;

        /// <summary>
        /// The structure of volumeMounts.
        /// See Block_volume_mount_in_init_container below for details.
        /// See Block_volume_mount_in_container below for details.
        /// </summary>
        public InputList<Inputs.EciScalingConfigurationContainerVolumeMountGetArgs> VolumeMounts
        {
            get => _volumeMounts ?? (_volumeMounts = new InputList<Inputs.EciScalingConfigurationContainerVolumeMountGetArgs>());
            set => _volumeMounts = value;
        }

        /// <summary>
        /// The working directory of the container.
        /// </summary>
        [Input("workingDir")]
        public Input<string>? WorkingDir { get; set; }

        public EciScalingConfigurationContainerGetArgs()
        {
        }
        public static new EciScalingConfigurationContainerGetArgs Empty => new EciScalingConfigurationContainerGetArgs();
    }
}
