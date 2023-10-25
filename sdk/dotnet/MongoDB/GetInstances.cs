// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.MongoDB
{
    public static class GetInstances
    {
        /// <summary>
        /// The `alicloud.mongodb.getInstances` data source provides a collection of MongoDB instances available in Alicloud account.
        /// Filters support regular expression for the instance name, engine or instance type.
        /// </summary>
        public static Task<GetInstancesResult> InvokeAsync(GetInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstancesResult>("alicloud:mongodb/getInstances:getInstances", args ?? new GetInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// The `alicloud.mongodb.getInstances` data source provides a collection of MongoDB instances available in Alicloud account.
        /// Filters support regular expression for the instance name, engine or instance type.
        /// </summary>
        public static Output<GetInstancesResult> Invoke(GetInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstancesResult>("alicloud:mongodb/getInstances:getInstances", args ?? new GetInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstancesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        [Input("availabilityZone")]
        public string? AvailabilityZone { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// The ids list of MongoDB instances
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Sizing of the instance to be queried.
        /// </summary>
        [Input("instanceClass")]
        public string? InstanceClass { get; set; }

        /// <summary>
        /// Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
        /// </summary>
        [Input("instanceType")]
        public string? InstanceType { get; set; }

        /// <summary>
        /// A regex string to apply to the instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// The name of file that can save the collection of instances after running `pulumi preview`.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("tags")]
        private Dictionary<string, object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public Dictionary<string, object> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, object>());
            set => _tags = value;
        }

        public GetInstancesArgs()
        {
        }
        public static new GetInstancesArgs Empty => new GetInstancesArgs();
    }

    public sealed class GetInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        [Input("availabilityZone")]
        public Input<string>? AvailabilityZone { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// The ids list of MongoDB instances
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Sizing of the instance to be queried.
        /// </summary>
        [Input("instanceClass")]
        public Input<string>? InstanceClass { get; set; }

        /// <summary>
        /// Type of the instance to be queried. If it is set to `sharding`, the sharded cluster instances are listed. If it is set to `replicate`, replica set instances are listed. Default value `replicate`.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// A regex string to apply to the instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// The name of file that can save the collection of instances after running `pulumi preview`.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        public GetInstancesInvokeArgs()
        {
        }
        public static new GetInstancesInvokeArgs Empty => new GetInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstancesResult
    {
        /// <summary>
        /// Instance availability zone.
        /// </summary>
        public readonly string? AvailabilityZone;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ids list of MongoDB instances
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// Sizing of the MongoDB instance.
        /// </summary>
        public readonly string? InstanceClass;
        /// <summary>
        /// Instance type. Optional values `sharding` or `replicate`.
        /// </summary>
        public readonly string? InstanceType;
        /// <summary>
        /// A list of MongoDB instances. Its every element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        /// <summary>
        /// The names list of MongoDB instances
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableDictionary<string, object>? Tags;

        [OutputConstructor]
        private GetInstancesResult(
            string? availabilityZone,

            string id,

            ImmutableArray<string> ids,

            string? instanceClass,

            string? instanceType,

            ImmutableArray<Outputs.GetInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableDictionary<string, object>? tags)
        {
            AvailabilityZone = availabilityZone;
            Id = id;
            Ids = ids;
            InstanceClass = instanceClass;
            InstanceType = instanceType;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Tags = tags;
        }
    }
}
