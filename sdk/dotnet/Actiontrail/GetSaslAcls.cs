// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ActionTrail
{
    public static partial class Invokes
    {
        /// <summary>
        /// This data source provides a list of ALIKAFKA Sasl acls in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.66.0+
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/alikafka_sasl_acls.html.markdown.
        /// </summary>
        public static Task<GetSaslAclsResult> GetSaslAcls(GetSaslAclsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSaslAclsResult>("alicloud:actiontrail/getSaslAcls:getSaslAcls", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetSaslAclsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Get results for the specified resource name. 
        /// </summary>
        [Input("aclResourceName", required: true)]
        public string AclResourceName { get; set; } = null!;

        /// <summary>
        /// Get results for the specified resource type. 
        /// </summary>
        [Input("aclResourceType", required: true)]
        public string AclResourceType { get; set; } = null!;

        /// <summary>
        /// ID of the ALIKAFKA Instance that owns the sasl acls.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Get results for the specified username. 
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetSaslAclsArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetSaslAclsResult
    {
        /// <summary>
        /// The resource name of the sasl acl.
        /// </summary>
        public readonly string AclResourceName;
        /// <summary>
        /// The resource type of the sasl acl.
        /// </summary>
        public readonly string AclResourceType;
        /// <summary>
        /// A list of sasl acls. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSaslAclsAclsResult> Acls;
        public readonly string InstanceId;
        public readonly string? OutputFile;
        /// <summary>
        /// The username of the sasl acl.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetSaslAclsResult(
            string aclResourceName,
            string aclResourceType,
            ImmutableArray<Outputs.GetSaslAclsAclsResult> acls,
            string instanceId,
            string? outputFile,
            string username,
            string id)
        {
            AclResourceName = aclResourceName;
            AclResourceType = aclResourceType;
            Acls = acls;
            InstanceId = instanceId;
            OutputFile = outputFile;
            Username = username;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetSaslAclsAclsResult
    {
        /// <summary>
        /// The operation type of the sasl acl.
        /// </summary>
        public readonly string AclOperationType;
        /// <summary>
        /// Get results for the specified resource name. 
        /// </summary>
        public readonly string AclResourceName;
        /// <summary>
        /// The resource pattern type of the sasl acl.
        /// </summary>
        public readonly string AclResourcePatternType;
        /// <summary>
        /// Get results for the specified resource type. 
        /// </summary>
        public readonly string AclResourceType;
        /// <summary>
        /// The host of the sasl acl.
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// Get results for the specified username. 
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private GetSaslAclsAclsResult(
            string aclOperationType,
            string aclResourceName,
            string aclResourcePatternType,
            string aclResourceType,
            string host,
            string username)
        {
            AclOperationType = aclOperationType;
            AclResourceName = aclResourceName;
            AclResourcePatternType = aclResourcePatternType;
            AclResourceType = aclResourceType;
            Host = host;
            Username = username;
        }
    }
    }
}