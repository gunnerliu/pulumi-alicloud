// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas.Outputs
{

    [OutputType]
    public sealed class GetApplicationsApplicationResult
    {
        /// <summary>
        /// The ID of the application that you want to deploy.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// The name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        /// </summary>
        public readonly string AppName;
        /// <summary>
        /// The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        /// </summary>
        public readonly string ApplicationType;
        /// <summary>
        /// The package ID of Enterprise Distributed Application Service (EDAS) Container.
        /// </summary>
        public readonly int BuildPackageId;
        /// <summary>
        /// The ID of the cluster that you want to create the application.
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The type of the cluster that you want to create. Valid values: 1: Swarm cluster. 2: ECS cluster. 3: Kubernetes cluster.
        /// </summary>
        public readonly int ClusterType;
        /// <summary>
        /// The ID of the namespace the application belongs to.
        /// </summary>
        public readonly string RegionId;

        [OutputConstructor]
        private GetApplicationsApplicationResult(
            string appId,

            string appName,

            string applicationType,

            int buildPackageId,

            string clusterId,

            int clusterType,

            string regionId)
        {
            AppId = appId;
            AppName = appName;
            ApplicationType = applicationType;
            BuildPackageId = buildPackageId;
            ClusterId = clusterId;
            ClusterType = clusterType;
            RegionId = regionId;
        }
    }
}
