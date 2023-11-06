// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package arms

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This data source provides the Arms Prometheus Monitorings of the current Alibaba Cloud user.
//
// > **NOTE:** Available since v1.210.0.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/arms"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ids, err := arms.GetPrometheusMonitorings(ctx, &arms.GetPrometheusMonitoringsArgs{
//				ClusterId: "your_cluster_id",
//				Ids: []string{
//					"example_id",
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("armsPrometheusMonitoringsId1", ids.PrometheusMonitorings[0].Id)
//			nameRegex, err := arms.GetPrometheusMonitorings(ctx, &arms.GetPrometheusMonitoringsArgs{
//				ClusterId: "your_cluster_id",
//				NameRegex: pulumi.StringRef("tf-example"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("armsPrometheusMonitoringsId2", nameRegex.PrometheusMonitorings[0].Id)
//			return nil
//		})
//	}
//
// ```
func GetPrometheusMonitorings(ctx *pulumi.Context, args *GetPrometheusMonitoringsArgs, opts ...pulumi.InvokeOption) (*GetPrometheusMonitoringsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPrometheusMonitoringsResult
	err := ctx.Invoke("alicloud:arms/getPrometheusMonitorings:getPrometheusMonitorings", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPrometheusMonitorings.
type GetPrometheusMonitoringsArgs struct {
	// The ID of the Prometheus instance.
	ClusterId string `pulumi:"clusterId"`
	// A list of Prometheus Monitoring IDs.
	Ids []string `pulumi:"ids"`
	// A regex string to filter results by Prometheus Monitoring name.
	NameRegex *string `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile *string `pulumi:"outputFile"`
	// The status of the monitoring configuration. Valid values: `run`, `stop`.
	Status *string `pulumi:"status"`
	// The type of the monitoring configuration. Valid values: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getPrometheusMonitorings.
type GetPrometheusMonitoringsResult struct {
	// The ID of the Prometheus instance.
	ClusterId string `pulumi:"clusterId"`
	// The provider-assigned unique ID for this managed resource.
	Id        string   `pulumi:"id"`
	Ids       []string `pulumi:"ids"`
	NameRegex *string  `pulumi:"nameRegex"`
	// A list of Prometheus Monitoring names.
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
	// A list of Prometheus Monitorings. Each element contains the following attributes:
	PrometheusMonitorings []GetPrometheusMonitoringsPrometheusMonitoring `pulumi:"prometheusMonitorings"`
	// The status of the monitoring configuration.
	Status *string `pulumi:"status"`
	// The type of the monitoring configuration.
	Type *string `pulumi:"type"`
}

func GetPrometheusMonitoringsOutput(ctx *pulumi.Context, args GetPrometheusMonitoringsOutputArgs, opts ...pulumi.InvokeOption) GetPrometheusMonitoringsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPrometheusMonitoringsResult, error) {
			args := v.(GetPrometheusMonitoringsArgs)
			r, err := GetPrometheusMonitorings(ctx, &args, opts...)
			var s GetPrometheusMonitoringsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPrometheusMonitoringsResultOutput)
}

// A collection of arguments for invoking getPrometheusMonitorings.
type GetPrometheusMonitoringsOutputArgs struct {
	// The ID of the Prometheus instance.
	ClusterId pulumi.StringInput `pulumi:"clusterId"`
	// A list of Prometheus Monitoring IDs.
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// A regex string to filter results by Prometheus Monitoring name.
	NameRegex pulumi.StringPtrInput `pulumi:"nameRegex"`
	// File name where to save data source results (after running `pulumi preview`).
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
	// The status of the monitoring configuration. Valid values: `run`, `stop`.
	Status pulumi.StringPtrInput `pulumi:"status"`
	// The type of the monitoring configuration. Valid values: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetPrometheusMonitoringsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrometheusMonitoringsArgs)(nil)).Elem()
}

// A collection of values returned by getPrometheusMonitorings.
type GetPrometheusMonitoringsResultOutput struct{ *pulumi.OutputState }

func (GetPrometheusMonitoringsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPrometheusMonitoringsResult)(nil)).Elem()
}

func (o GetPrometheusMonitoringsResultOutput) ToGetPrometheusMonitoringsResultOutput() GetPrometheusMonitoringsResultOutput {
	return o
}

func (o GetPrometheusMonitoringsResultOutput) ToGetPrometheusMonitoringsResultOutputWithContext(ctx context.Context) GetPrometheusMonitoringsResultOutput {
	return o
}

// The ID of the Prometheus instance.
func (o GetPrometheusMonitoringsResultOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) string { return v.ClusterId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPrometheusMonitoringsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPrometheusMonitoringsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetPrometheusMonitoringsResultOutput) NameRegex() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) *string { return v.NameRegex }).(pulumi.StringPtrOutput)
}

// A list of Prometheus Monitoring names.
func (o GetPrometheusMonitoringsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetPrometheusMonitoringsResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

// A list of Prometheus Monitorings. Each element contains the following attributes:
func (o GetPrometheusMonitoringsResultOutput) PrometheusMonitorings() GetPrometheusMonitoringsPrometheusMonitoringArrayOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) []GetPrometheusMonitoringsPrometheusMonitoring {
		return v.PrometheusMonitorings
	}).(GetPrometheusMonitoringsPrometheusMonitoringArrayOutput)
}

// The status of the monitoring configuration.
func (o GetPrometheusMonitoringsResultOutput) Status() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) *string { return v.Status }).(pulumi.StringPtrOutput)
}

// The type of the monitoring configuration.
func (o GetPrometheusMonitoringsResultOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPrometheusMonitoringsResult) *string { return v.Type }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPrometheusMonitoringsResultOutput{})
}
