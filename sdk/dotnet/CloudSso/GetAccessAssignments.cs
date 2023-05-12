// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    public static class GetAccessAssignments
    {
        /// <summary>
        /// This data source provides the Cloud Sso Access Assignments of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.193.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.CloudSso.GetAccessAssignments.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoAccessAssignmentId1"] = ids.Apply(getAccessAssignmentsResult =&gt; getAccessAssignmentsResult.Assignments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAccessAssignmentsResult> InvokeAsync(GetAccessAssignmentsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccessAssignmentsResult>("alicloud:cloudsso/getAccessAssignments:getAccessAssignments", args ?? new GetAccessAssignmentsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Sso Access Assignments of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.193.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.CloudSso.GetAccessAssignments.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoAccessAssignmentId1"] = ids.Apply(getAccessAssignmentsResult =&gt; getAccessAssignmentsResult.Assignments[0]?.Id),
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAccessAssignmentsResult> Invoke(GetAccessAssignmentsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccessAssignmentsResult>("alicloud:cloudsso/getAccessAssignments:getAccessAssignments", args ?? new GetAccessAssignmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccessAssignmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Access configuration ID.
        /// </summary>
        [Input("accessConfigurationId")]
        public string? AccessConfigurationId { get; set; }

        /// <summary>
        /// Directory ID.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Access Assignment IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Create the identity type of the access assignment, which can be a user or a user group.
        /// </summary>
        [Input("principalType")]
        public string? PrincipalType { get; set; }

        /// <summary>
        /// The ID of the target to create the resource range.
        /// </summary>
        [Input("targetId")]
        public string? TargetId { get; set; }

        /// <summary>
        /// The type of the resource range target to be accessed. Only a single RD primary account or member account can be specified in the first phase.
        /// </summary>
        [Input("targetType")]
        public string? TargetType { get; set; }

        public GetAccessAssignmentsArgs()
        {
        }
        public static new GetAccessAssignmentsArgs Empty => new GetAccessAssignmentsArgs();
    }

    public sealed class GetAccessAssignmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Access configuration ID.
        /// </summary>
        [Input("accessConfigurationId")]
        public Input<string>? AccessConfigurationId { get; set; }

        /// <summary>
        /// Directory ID.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Access Assignment IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Create the identity type of the access assignment, which can be a user or a user group.
        /// </summary>
        [Input("principalType")]
        public Input<string>? PrincipalType { get; set; }

        /// <summary>
        /// The ID of the target to create the resource range.
        /// </summary>
        [Input("targetId")]
        public Input<string>? TargetId { get; set; }

        /// <summary>
        /// The type of the resource range target to be accessed. Only a single RD primary account or member account can be specified in the first phase.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        public GetAccessAssignmentsInvokeArgs()
        {
        }
        public static new GetAccessAssignmentsInvokeArgs Empty => new GetAccessAssignmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccessAssignmentsResult
    {
        public readonly string? AccessConfigurationId;
        public readonly ImmutableArray<Outputs.GetAccessAssignmentsAssignmentResult> Assignments;
        public readonly string DirectoryId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string? PrincipalType;
        public readonly string? TargetId;
        public readonly string? TargetType;

        [OutputConstructor]
        private GetAccessAssignmentsResult(
            string? accessConfigurationId,

            ImmutableArray<Outputs.GetAccessAssignmentsAssignmentResult> assignments,

            string directoryId,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? principalType,

            string? targetId,

            string? targetType)
        {
            AccessConfigurationId = accessConfigurationId;
            Assignments = assignments;
            DirectoryId = directoryId;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PrincipalType = principalType;
            TargetId = targetId;
            TargetType = targetType;
        }
    }
}
