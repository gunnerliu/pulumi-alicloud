// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eci
{
    public static class GetContainerGroups
    {
        /// <summary>
        /// This data source provides the Eci Container Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.Eci.GetContainerGroups.InvokeAsync(new AliCloud.Eci.GetContainerGroupsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.FirstEciContainerGroupId = example.Apply(example =&gt; example.Groups?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstEciContainerGroupId")]
        ///     public Output&lt;string&gt; FirstEciContainerGroupId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetContainerGroupsResult> InvokeAsync(GetContainerGroupsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetContainerGroupsResult>("alicloud:eci/getContainerGroups:getContainerGroups", args ?? new GetContainerGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Eci Container Groups of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(AliCloud.Eci.GetContainerGroups.InvokeAsync(new AliCloud.Eci.GetContainerGroupsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.FirstEciContainerGroupId = example.Apply(example =&gt; example.Groups?[0]?.Id);
        ///     }
        /// 
        ///     [Output("firstEciContainerGroupId")]
        ///     public Output&lt;string&gt; FirstEciContainerGroupId { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetContainerGroupsResult> Invoke(GetContainerGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetContainerGroupsResult>("alicloud:eci/getContainerGroups:getContainerGroups", args ?? new GetContainerGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetContainerGroupsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of ContainerGroup.
        /// </summary>
        [Input("containerGroupName")]
        public string? ContainerGroupName { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Container Group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
        /// </summary>
        [Input("limit")]
        public int? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Container Group name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of container.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId")]
        public string? VswitchId { get; set; }

        [Input("withEvent")]
        public bool? WithEvent { get; set; }

        /// <summary>
        /// The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetContainerGroupsArgs()
        {
        }
    }

    public sealed class GetContainerGroupsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of ContainerGroup.
        /// </summary>
        [Input("containerGroupName")]
        public Input<string>? ContainerGroupName { get; set; }

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Container Group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The maximum number of resources returned in the response. Default value is `20`. Maximum value: `20`. The number of returned results is no greater than the specified number.
        /// </summary>
        [Input("limit")]
        public Input<int>? Limit { get; set; }

        /// <summary>
        /// A regex string to filter results by Container Group name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the resource group to which the container group belongs. If you have not specified a resource group for the container group, it is added to the default resource group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of container.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// The tags attached to the container group. Each tag is a key-value pair. You can attach up to 20 tags to a container group.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The vswitch id.
        /// </summary>
        [Input("vswitchId")]
        public Input<string>? VswitchId { get; set; }

        [Input("withEvent")]
        public Input<bool>? WithEvent { get; set; }

        /// <summary>
        /// The IDs of the zones where the container groups are deployed. If this parameter is not set, the system automatically selects the zones. By default, no value is specified.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetContainerGroupsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetContainerGroupsResult
    {
        public readonly string? ContainerGroupName;
        public readonly bool? EnableDetails;
        public readonly ImmutableArray<Outputs.GetContainerGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly int? Limit;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ResourceGroupId;
        public readonly string? Status;
        public readonly ImmutableDictionary<string, object>? Tags;
        public readonly string? VswitchId;
        public readonly bool? WithEvent;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetContainerGroupsResult(
            string? containerGroupName,

            bool? enableDetails,

            ImmutableArray<Outputs.GetContainerGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            int? limit,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? resourceGroupId,

            string? status,

            ImmutableDictionary<string, object>? tags,

            string? vswitchId,

            bool? withEvent,

            string? zoneId)
        {
            ContainerGroupName = containerGroupName;
            EnableDetails = enableDetails;
            Groups = groups;
            Id = id;
            Ids = ids;
            Limit = limit;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ResourceGroupId = resourceGroupId;
            Status = status;
            Tags = tags;
            VswitchId = vswitchId;
            WithEvent = withEvent;
            ZoneId = zoneId;
        }
    }
}
