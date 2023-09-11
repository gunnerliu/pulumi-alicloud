// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This data source is the character set supported by querying RDS instances.
//
// > **NOTE:** Available in v1.198.0+.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			names, err := rds.GetCharacterSetNames(ctx, &rds.GetCharacterSetNamesArgs{
//				Engine: "MySQL",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firstRdsCharacterSetNames", names.Names[0])
//			return nil
//		})
//	}
//
// ```
func GetCharacterSetNames(ctx *pulumi.Context, args *GetCharacterSetNamesArgs, opts ...pulumi.InvokeOption) (*GetCharacterSetNamesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetCharacterSetNamesResult
	err := ctx.Invoke("alicloud:rds/getCharacterSetNames:getCharacterSetNames", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getCharacterSetNames.
type GetCharacterSetNamesArgs struct {
	// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`.
	Engine     string  `pulumi:"engine"`
	OutputFile *string `pulumi:"outputFile"`
}

// A collection of values returned by getCharacterSetNames.
type GetCharacterSetNamesResult struct {
	Engine string `pulumi:"engine"`
	// The provider-assigned unique ID for this managed resource.
	Id         string   `pulumi:"id"`
	Names      []string `pulumi:"names"`
	OutputFile *string  `pulumi:"outputFile"`
}

func GetCharacterSetNamesOutput(ctx *pulumi.Context, args GetCharacterSetNamesOutputArgs, opts ...pulumi.InvokeOption) GetCharacterSetNamesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetCharacterSetNamesResult, error) {
			args := v.(GetCharacterSetNamesArgs)
			r, err := GetCharacterSetNames(ctx, &args, opts...)
			var s GetCharacterSetNamesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetCharacterSetNamesResultOutput)
}

// A collection of arguments for invoking getCharacterSetNames.
type GetCharacterSetNamesOutputArgs struct {
	// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`.
	Engine     pulumi.StringInput    `pulumi:"engine"`
	OutputFile pulumi.StringPtrInput `pulumi:"outputFile"`
}

func (GetCharacterSetNamesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCharacterSetNamesArgs)(nil)).Elem()
}

// A collection of values returned by getCharacterSetNames.
type GetCharacterSetNamesResultOutput struct{ *pulumi.OutputState }

func (GetCharacterSetNamesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetCharacterSetNamesResult)(nil)).Elem()
}

func (o GetCharacterSetNamesResultOutput) ToGetCharacterSetNamesResultOutput() GetCharacterSetNamesResultOutput {
	return o
}

func (o GetCharacterSetNamesResultOutput) ToGetCharacterSetNamesResultOutputWithContext(ctx context.Context) GetCharacterSetNamesResultOutput {
	return o
}

func (o GetCharacterSetNamesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetCharacterSetNamesResult] {
	return pulumix.Output[GetCharacterSetNamesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetCharacterSetNamesResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v GetCharacterSetNamesResult) string { return v.Engine }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetCharacterSetNamesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetCharacterSetNamesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetCharacterSetNamesResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetCharacterSetNamesResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func (o GetCharacterSetNamesResultOutput) OutputFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetCharacterSetNamesResult) *string { return v.OutputFile }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetCharacterSetNamesResultOutput{})
}
