// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    public static class GetAccelerators
    {
        /// <summary>
        /// This data source provides the Global Accelerator (GA) Accelerators of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
        /// </summary>
        public static Task<GetAcceleratorsResult> InvokeAsync(GetAcceleratorsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAcceleratorsResult>("alicloud:ga/getAccelerators:getAccelerators", args ?? new GetAcceleratorsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Global Accelerator (GA) Accelerators of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.111.0+.
        /// </summary>
        public static Output<GetAcceleratorsResult> Invoke(GetAcceleratorsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAcceleratorsResult>("alicloud:ga/getAccelerators:getAccelerators", args ?? new GetAcceleratorsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAcceleratorsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Accelerator IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Accelerator name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the GA instance.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetAcceleratorsArgs()
        {
        }
        public static new GetAcceleratorsArgs Empty => new GetAcceleratorsArgs();
    }

    public sealed class GetAcceleratorsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Accelerator IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Accelerator name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the GA instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetAcceleratorsInvokeArgs()
        {
        }
        public static new GetAcceleratorsInvokeArgs Empty => new GetAcceleratorsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAcceleratorsResult
    {
        public readonly ImmutableArray<Outputs.GetAcceleratorsAcceleratorResult> Accelerators;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetAcceleratorsResult(
            ImmutableArray<Outputs.GetAcceleratorsAcceleratorResult> accelerators,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            Accelerators = accelerators;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}
