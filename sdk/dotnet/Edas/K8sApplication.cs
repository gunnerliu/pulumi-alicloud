// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas
{
    /// <summary>
    /// Create an EDAS k8s application.For information about EDAS K8s Application and how to use it, see [What is EDAS K8s Application](https://www.alibabacloud.com/help/doc-detail/85029.htm).
    /// 
    /// &gt; **NOTE:** Available in 1.105.0+
    /// 
    /// ## Import
    /// 
    /// EDAS k8s application can be imported as below, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:edas/k8sApplication:K8sApplication new_k8s_application application_id
    /// ```
    /// </summary>
    public partial class K8sApplication : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the application
        /// </summary>
        [Output("applicationDescriotion")]
        public Output<string?> ApplicationDescriotion { get; private set; } = null!;

        /// <summary>
        /// The name of the application you want to create. Must start with character,supports numbers, letters and dashes (-), supports up to 36 characters
        /// </summary>
        [Output("applicationName")]
        public Output<string> ApplicationName { get; private set; } = null!;

        /// <summary>
        /// The ID of the alicloud container service kubernetes cluster that you want to import to. You can call the ListCluster operation to query.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The set command, if set, will replace the startup command in the mirror when the mirror is started.
        /// </summary>
        [Output("command")]
        public Output<string?> Command { get; private set; } = null!;

        /// <summary>
        /// Used in combination with the command, the parameter of the command is a JsonArray string in the format: `[{"argument":"-c"},{"argument":"test"}]`. Among them, -c and test are two parameters that need to be set.
        /// </summary>
        [Output("commandArgs")]
        public Output<ImmutableArray<string>> CommandArgs { get; private set; } = null!;

        /// <summary>
        /// EDAS-Container version that the deployed package depends on. Image does not support this parameter.
        /// </summary>
        [Output("edasContainerVersion")]
        public Output<string?> EdasContainerVersion { get; private set; } = null!;

        /// <summary>
        /// Deployment environment variables, the format must conform to the JSON object array, such as: `{"name":"x","value":"y"},{"name":"x2","value":"y2"}`, If you want to cancel the configuration, you need to set an empty JSON array "" to indicate no configuration.
        /// </summary>
        [Output("envs")]
        public Output<ImmutableDictionary<string, string>?> Envs { get; private set; } = null!;

        /// <summary>
        /// Mirror address. When the package_type is set to 'Image', this parameter item is required.
        /// </summary>
        [Output("imageUrl")]
        public Output<string?> ImageUrl { get; private set; } = null!;

        /// <summary>
        /// Public network SLB ID. If not configured, EDAS will automatically purchase a new SLB for the user.
        /// </summary>
        [Output("internetSlbId")]
        public Output<string?> InternetSlbId { get; private set; } = null!;

        /// <summary>
        /// The public network SLB front-end port, range 1~65535.
        /// </summary>
        [Output("internetSlbPort")]
        public Output<int?> InternetSlbPort { get; private set; } = null!;

        /// <summary>
        /// The public network SLB protocol supports TCP, HTTP and HTTPS protocols.
        /// </summary>
        [Output("internetSlbProtocol")]
        public Output<string?> InternetSlbProtocol { get; private set; } = null!;

        /// <summary>
        /// The private SLB back-end port, is also the service port of the application, ranging from 1 to 65535.
        /// </summary>
        [Output("internetTargetPort")]
        public Output<int?> InternetTargetPort { get; private set; } = null!;

        /// <summary>
        /// The JDK version that the deployed package depends on. The optional parameter values are Open JDK 7 and Open JDK 8. Image does not support this parameter.
        /// </summary>
        [Output("jdk")]
        public Output<string?> Jdk { get; private set; } = null!;

        /// <summary>
        /// The CPU quota of the application instance during application operation. Unit: Number of millcores, set to 0 means unlimited, similar to request_cpu.
        /// </summary>
        [Output("limitMCpu")]
        public Output<int?> LimitMCpu { get; private set; } = null!;

        /// <summary>
        /// The memory limit of the application instance during application operation, unit: M.
        /// </summary>
        [Output("limitMem")]
        public Output<int?> LimitMem { get; private set; } = null!;

        /// <summary>
        /// Container survival status monitoring, format such as: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080} }`.
        /// </summary>
        [Output("liveness")]
        public Output<string?> Liveness { get; private set; } = null!;

        /// <summary>
        /// The configuration of the host file mounted to the container. For example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt", "mountPath":"/app/storage"}]`. Among them, nodePath is the host path; mountPath is the path in the container; type is the mount type.
        /// </summary>
        [Output("localVolume")]
        public Output<string?> LocalVolume { get; private set; } = null!;

        /// <summary>
        /// The ID corresponding to the EDAS namespace, the non-default namespace must be filled in.
        /// </summary>
        [Output("logicalRegionId")]
        public Output<string?> LogicalRegionId { get; private set; } = null!;

        /// <summary>
        /// Mount configuration description, as a serialized JSON. For example: `[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}]`. Among them, nasPath refers to the file storage path; mountPath refers to the path mounted in the container.
        /// </summary>
        [Output("mountDescs")]
        public Output<string?> MountDescs { get; private set; } = null!;

        /// <summary>
        /// The namespace of the K8s cluster, it will determine which K8s namespace your application is deployed in. The default is 'default'.
        /// </summary>
        [Output("namespace")]
        public Output<string?> Namespace { get; private set; } = null!;

        /// <summary>
        /// The ID of the mounted NAS must be in the same region as the cluster. It must have an available mount point creation quota, or its mount point must be on a switch in the VPC. If it is not filled in and the mountDescs field exists, a NAS will be automatically purchased and mounted on the switch in the VPC by default.
        /// </summary>
        [Output("nasId")]
        public Output<string?> NasId { get; private set; } = null!;

        /// <summary>
        /// Application package type. Optional parameter values include: FatJar, WAR and Image.
        /// </summary>
        [Output("packageType")]
        public Output<string?> PackageType { get; private set; } = null!;

        /// <summary>
        /// The url of the package to deploy.Applications deployed through FatJar or WAR packages need to configure it.
        /// </summary>
        [Output("packageUrl")]
        public Output<string?> PackageUrl { get; private set; } = null!;

        /// <summary>
        /// The version number of the deployment package. WAR and FatJar types are required. Please customize its meaning.
        /// </summary>
        [Output("packageVersion")]
        public Output<string?> PackageVersion { get; private set; } = null!;

        /// <summary>
        /// Execute script after startup
        /// </summary>
        [Output("postStart")]
        public Output<string?> PostStart { get; private set; } = null!;

        /// <summary>
        /// Execute script before stopping
        /// </summary>
        [Output("preStop")]
        public Output<string?> PreStop { get; private set; } = null!;

        /// <summary>
        /// Container service status check. If the check fails, the traffic passing through K8s Service will not be transferred to the container. The format is: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1, "httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": [{"name": "test","value": "testvalue"} ]}}`.
        /// </summary>
        [Output("readiness")]
        public Output<string?> Readiness { get; private set; } = null!;

        /// <summary>
        /// Number of application instances.
        /// </summary>
        [Output("replicas")]
        public Output<int?> Replicas { get; private set; } = null!;

        /// <summary>
        /// When the application is created, the CPU quota of the application instance, unit: number of millcores, similar to request_cpu
        /// </summary>
        [Output("requestsMCpu")]
        public Output<int?> RequestsMCpu { get; private set; } = null!;

        /// <summary>
        /// When the application is created, the memory limit of the application instance, unit: M. When set to 0, it means unlimited.
        /// </summary>
        [Output("requestsMem")]
        public Output<int?> RequestsMem { get; private set; } = null!;

        /// <summary>
        /// The Tomcat version that the deployment package depends on. Applicable to Spring Cloud and Dubbo applications deployed through WAR packages. Image does not support this parameter.
        /// </summary>
        [Output("webContainer")]
        public Output<string?> WebContainer { get; private set; } = null!;


        /// <summary>
        /// Create a K8sApplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public K8sApplication(string name, K8sApplicationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:edas/k8sApplication:K8sApplication", name, args ?? new K8sApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private K8sApplication(string name, Input<string> id, K8sApplicationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:edas/k8sApplication:K8sApplication", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing K8sApplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static K8sApplication Get(string name, Input<string> id, K8sApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new K8sApplication(name, id, state, options);
        }
    }

    public sealed class K8sApplicationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the application
        /// </summary>
        [Input("applicationDescriotion")]
        public Input<string>? ApplicationDescriotion { get; set; }

        /// <summary>
        /// The name of the application you want to create. Must start with character,supports numbers, letters and dashes (-), supports up to 36 characters
        /// </summary>
        [Input("applicationName", required: true)]
        public Input<string> ApplicationName { get; set; } = null!;

        /// <summary>
        /// The ID of the alicloud container service kubernetes cluster that you want to import to. You can call the ListCluster operation to query.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The set command, if set, will replace the startup command in the mirror when the mirror is started.
        /// </summary>
        [Input("command")]
        public Input<string>? Command { get; set; }

        [Input("commandArgs")]
        private InputList<string>? _commandArgs;

        /// <summary>
        /// Used in combination with the command, the parameter of the command is a JsonArray string in the format: `[{"argument":"-c"},{"argument":"test"}]`. Among them, -c and test are two parameters that need to be set.
        /// </summary>
        public InputList<string> CommandArgs
        {
            get => _commandArgs ?? (_commandArgs = new InputList<string>());
            set => _commandArgs = value;
        }

        /// <summary>
        /// EDAS-Container version that the deployed package depends on. Image does not support this parameter.
        /// </summary>
        [Input("edasContainerVersion")]
        public Input<string>? EdasContainerVersion { get; set; }

        [Input("envs")]
        private InputMap<string>? _envs;

        /// <summary>
        /// Deployment environment variables, the format must conform to the JSON object array, such as: `{"name":"x","value":"y"},{"name":"x2","value":"y2"}`, If you want to cancel the configuration, you need to set an empty JSON array "" to indicate no configuration.
        /// </summary>
        public InputMap<string> Envs
        {
            get => _envs ?? (_envs = new InputMap<string>());
            set => _envs = value;
        }

        /// <summary>
        /// Mirror address. When the package_type is set to 'Image', this parameter item is required.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// Public network SLB ID. If not configured, EDAS will automatically purchase a new SLB for the user.
        /// </summary>
        [Input("internetSlbId")]
        public Input<string>? InternetSlbId { get; set; }

        /// <summary>
        /// The public network SLB front-end port, range 1~65535.
        /// </summary>
        [Input("internetSlbPort")]
        public Input<int>? InternetSlbPort { get; set; }

        /// <summary>
        /// The public network SLB protocol supports TCP, HTTP and HTTPS protocols.
        /// </summary>
        [Input("internetSlbProtocol")]
        public Input<string>? InternetSlbProtocol { get; set; }

        /// <summary>
        /// The private SLB back-end port, is also the service port of the application, ranging from 1 to 65535.
        /// </summary>
        [Input("internetTargetPort")]
        public Input<int>? InternetTargetPort { get; set; }

        /// <summary>
        /// The JDK version that the deployed package depends on. The optional parameter values are Open JDK 7 and Open JDK 8. Image does not support this parameter.
        /// </summary>
        [Input("jdk")]
        public Input<string>? Jdk { get; set; }

        /// <summary>
        /// The CPU quota of the application instance during application operation. Unit: Number of millcores, set to 0 means unlimited, similar to request_cpu.
        /// </summary>
        [Input("limitMCpu")]
        public Input<int>? LimitMCpu { get; set; }

        /// <summary>
        /// The memory limit of the application instance during application operation, unit: M.
        /// </summary>
        [Input("limitMem")]
        public Input<int>? LimitMem { get; set; }

        /// <summary>
        /// Container survival status monitoring, format such as: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080} }`.
        /// </summary>
        [Input("liveness")]
        public Input<string>? Liveness { get; set; }

        /// <summary>
        /// The configuration of the host file mounted to the container. For example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt", "mountPath":"/app/storage"}]`. Among them, nodePath is the host path; mountPath is the path in the container; type is the mount type.
        /// </summary>
        [Input("localVolume")]
        public Input<string>? LocalVolume { get; set; }

        /// <summary>
        /// The ID corresponding to the EDAS namespace, the non-default namespace must be filled in.
        /// </summary>
        [Input("logicalRegionId")]
        public Input<string>? LogicalRegionId { get; set; }

        /// <summary>
        /// Mount configuration description, as a serialized JSON. For example: `[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}]`. Among them, nasPath refers to the file storage path; mountPath refers to the path mounted in the container.
        /// </summary>
        [Input("mountDescs")]
        public Input<string>? MountDescs { get; set; }

        /// <summary>
        /// The namespace of the K8s cluster, it will determine which K8s namespace your application is deployed in. The default is 'default'.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The ID of the mounted NAS must be in the same region as the cluster. It must have an available mount point creation quota, or its mount point must be on a switch in the VPC. If it is not filled in and the mountDescs field exists, a NAS will be automatically purchased and mounted on the switch in the VPC by default.
        /// </summary>
        [Input("nasId")]
        public Input<string>? NasId { get; set; }

        /// <summary>
        /// Application package type. Optional parameter values include: FatJar, WAR and Image.
        /// </summary>
        [Input("packageType")]
        public Input<string>? PackageType { get; set; }

        /// <summary>
        /// The url of the package to deploy.Applications deployed through FatJar or WAR packages need to configure it.
        /// </summary>
        [Input("packageUrl")]
        public Input<string>? PackageUrl { get; set; }

        /// <summary>
        /// The version number of the deployment package. WAR and FatJar types are required. Please customize its meaning.
        /// </summary>
        [Input("packageVersion")]
        public Input<string>? PackageVersion { get; set; }

        /// <summary>
        /// Execute script after startup
        /// </summary>
        [Input("postStart")]
        public Input<string>? PostStart { get; set; }

        /// <summary>
        /// Execute script before stopping
        /// </summary>
        [Input("preStop")]
        public Input<string>? PreStop { get; set; }

        /// <summary>
        /// Container service status check. If the check fails, the traffic passing through K8s Service will not be transferred to the container. The format is: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1, "httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": [{"name": "test","value": "testvalue"} ]}}`.
        /// </summary>
        [Input("readiness")]
        public Input<string>? Readiness { get; set; }

        /// <summary>
        /// Number of application instances.
        /// </summary>
        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        /// <summary>
        /// When the application is created, the CPU quota of the application instance, unit: number of millcores, similar to request_cpu
        /// </summary>
        [Input("requestsMCpu")]
        public Input<int>? RequestsMCpu { get; set; }

        /// <summary>
        /// When the application is created, the memory limit of the application instance, unit: M. When set to 0, it means unlimited.
        /// </summary>
        [Input("requestsMem")]
        public Input<int>? RequestsMem { get; set; }

        /// <summary>
        /// The Tomcat version that the deployment package depends on. Applicable to Spring Cloud and Dubbo applications deployed through WAR packages. Image does not support this parameter.
        /// </summary>
        [Input("webContainer")]
        public Input<string>? WebContainer { get; set; }

        public K8sApplicationArgs()
        {
        }
    }

    public sealed class K8sApplicationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the application
        /// </summary>
        [Input("applicationDescriotion")]
        public Input<string>? ApplicationDescriotion { get; set; }

        /// <summary>
        /// The name of the application you want to create. Must start with character,supports numbers, letters and dashes (-), supports up to 36 characters
        /// </summary>
        [Input("applicationName")]
        public Input<string>? ApplicationName { get; set; }

        /// <summary>
        /// The ID of the alicloud container service kubernetes cluster that you want to import to. You can call the ListCluster operation to query.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The set command, if set, will replace the startup command in the mirror when the mirror is started.
        /// </summary>
        [Input("command")]
        public Input<string>? Command { get; set; }

        [Input("commandArgs")]
        private InputList<string>? _commandArgs;

        /// <summary>
        /// Used in combination with the command, the parameter of the command is a JsonArray string in the format: `[{"argument":"-c"},{"argument":"test"}]`. Among them, -c and test are two parameters that need to be set.
        /// </summary>
        public InputList<string> CommandArgs
        {
            get => _commandArgs ?? (_commandArgs = new InputList<string>());
            set => _commandArgs = value;
        }

        /// <summary>
        /// EDAS-Container version that the deployed package depends on. Image does not support this parameter.
        /// </summary>
        [Input("edasContainerVersion")]
        public Input<string>? EdasContainerVersion { get; set; }

        [Input("envs")]
        private InputMap<string>? _envs;

        /// <summary>
        /// Deployment environment variables, the format must conform to the JSON object array, such as: `{"name":"x","value":"y"},{"name":"x2","value":"y2"}`, If you want to cancel the configuration, you need to set an empty JSON array "" to indicate no configuration.
        /// </summary>
        public InputMap<string> Envs
        {
            get => _envs ?? (_envs = new InputMap<string>());
            set => _envs = value;
        }

        /// <summary>
        /// Mirror address. When the package_type is set to 'Image', this parameter item is required.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// Public network SLB ID. If not configured, EDAS will automatically purchase a new SLB for the user.
        /// </summary>
        [Input("internetSlbId")]
        public Input<string>? InternetSlbId { get; set; }

        /// <summary>
        /// The public network SLB front-end port, range 1~65535.
        /// </summary>
        [Input("internetSlbPort")]
        public Input<int>? InternetSlbPort { get; set; }

        /// <summary>
        /// The public network SLB protocol supports TCP, HTTP and HTTPS protocols.
        /// </summary>
        [Input("internetSlbProtocol")]
        public Input<string>? InternetSlbProtocol { get; set; }

        /// <summary>
        /// The private SLB back-end port, is also the service port of the application, ranging from 1 to 65535.
        /// </summary>
        [Input("internetTargetPort")]
        public Input<int>? InternetTargetPort { get; set; }

        /// <summary>
        /// The JDK version that the deployed package depends on. The optional parameter values are Open JDK 7 and Open JDK 8. Image does not support this parameter.
        /// </summary>
        [Input("jdk")]
        public Input<string>? Jdk { get; set; }

        /// <summary>
        /// The CPU quota of the application instance during application operation. Unit: Number of millcores, set to 0 means unlimited, similar to request_cpu.
        /// </summary>
        [Input("limitMCpu")]
        public Input<int>? LimitMCpu { get; set; }

        /// <summary>
        /// The memory limit of the application instance during application operation, unit: M.
        /// </summary>
        [Input("limitMem")]
        public Input<int>? LimitMem { get; set; }

        /// <summary>
        /// Container survival status monitoring, format such as: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1,"tcpSocket":{"host":"", "port":8080} }`.
        /// </summary>
        [Input("liveness")]
        public Input<string>? Liveness { get; set; }

        /// <summary>
        /// The configuration of the host file mounted to the container. For example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt", "mountPath":"/app/storage"}]`. Among them, nodePath is the host path; mountPath is the path in the container; type is the mount type.
        /// </summary>
        [Input("localVolume")]
        public Input<string>? LocalVolume { get; set; }

        /// <summary>
        /// The ID corresponding to the EDAS namespace, the non-default namespace must be filled in.
        /// </summary>
        [Input("logicalRegionId")]
        public Input<string>? LogicalRegionId { get; set; }

        /// <summary>
        /// Mount configuration description, as a serialized JSON. For example: `[{"nasPath": "/k8s","mountPath": "/mnt"},{"nasPath": "/files","mountPath": "/app/files"}]`. Among them, nasPath refers to the file storage path; mountPath refers to the path mounted in the container.
        /// </summary>
        [Input("mountDescs")]
        public Input<string>? MountDescs { get; set; }

        /// <summary>
        /// The namespace of the K8s cluster, it will determine which K8s namespace your application is deployed in. The default is 'default'.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// The ID of the mounted NAS must be in the same region as the cluster. It must have an available mount point creation quota, or its mount point must be on a switch in the VPC. If it is not filled in and the mountDescs field exists, a NAS will be automatically purchased and mounted on the switch in the VPC by default.
        /// </summary>
        [Input("nasId")]
        public Input<string>? NasId { get; set; }

        /// <summary>
        /// Application package type. Optional parameter values include: FatJar, WAR and Image.
        /// </summary>
        [Input("packageType")]
        public Input<string>? PackageType { get; set; }

        /// <summary>
        /// The url of the package to deploy.Applications deployed through FatJar or WAR packages need to configure it.
        /// </summary>
        [Input("packageUrl")]
        public Input<string>? PackageUrl { get; set; }

        /// <summary>
        /// The version number of the deployment package. WAR and FatJar types are required. Please customize its meaning.
        /// </summary>
        [Input("packageVersion")]
        public Input<string>? PackageVersion { get; set; }

        /// <summary>
        /// Execute script after startup
        /// </summary>
        [Input("postStart")]
        public Input<string>? PostStart { get; set; }

        /// <summary>
        /// Execute script before stopping
        /// </summary>
        [Input("preStop")]
        public Input<string>? PreStop { get; set; }

        /// <summary>
        /// Container service status check. If the check fails, the traffic passing through K8s Service will not be transferred to the container. The format is: `{"failureThreshold": 3,"initialDelaySeconds": 5,"successThreshold": 1,"timeoutSeconds": 1, "httpGet": {"path": "/consumer","port": 8080,"scheme": "HTTP","httpHeaders": [{"name": "test","value": "testvalue"} ]}}`.
        /// </summary>
        [Input("readiness")]
        public Input<string>? Readiness { get; set; }

        /// <summary>
        /// Number of application instances.
        /// </summary>
        [Input("replicas")]
        public Input<int>? Replicas { get; set; }

        /// <summary>
        /// When the application is created, the CPU quota of the application instance, unit: number of millcores, similar to request_cpu
        /// </summary>
        [Input("requestsMCpu")]
        public Input<int>? RequestsMCpu { get; set; }

        /// <summary>
        /// When the application is created, the memory limit of the application instance, unit: M. When set to 0, it means unlimited.
        /// </summary>
        [Input("requestsMem")]
        public Input<int>? RequestsMem { get; set; }

        /// <summary>
        /// The Tomcat version that the deployment package depends on. Applicable to Spring Cloud and Dubbo applications deployed through WAR packages. Image does not support this parameter.
        /// </summary>
        [Input("webContainer")]
        public Input<string>? WebContainer { get; set; }

        public K8sApplicationState()
        {
        }
    }
}
